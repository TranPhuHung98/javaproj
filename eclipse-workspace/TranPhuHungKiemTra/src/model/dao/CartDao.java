package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

import controller.ConnectionDatabase;
import model.bean.CartBean;
import model.bean.OrderBean;
import model.bean.OrderDetailBean;

public class CartDao {
	Connection cnn = ConnectionDatabase.connectionDB();
	
	public ArrayList<CartBean> getCarts(int idCustomer) throws Exception {
		ArrayList<CartBean> carts = new ArrayList<CartBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM cart WHERE idUser=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idCustomer);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDCart = rs.getInt("idCart");
			int iDCustomer = rs.getInt("idUser");
			int idBook = rs.getInt("idBook");
			int quantity = rs.getInt("quantity");
			carts.add(new CartBean(iDCart, iDCustomer, idBook, quantity));
		}		
		// Đóng CSDL
		cmd.close();
		rs.close();
		return carts;
	}
	
	public void addCart(int idBook, int idCustomer, int quantity) throws Exception{
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Add Cart
		String query = "INSERT INTO cart (idUser, idBook, quantity) VALUES (?, ?, ?)";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idCustomer);
		cmd.setInt(2, idBook);
		cmd.setInt(3, quantity);
		cmd.executeUpdate();
		// Đóng CSDL
		cmd.close();
	}
	
	public boolean checkCart(int idBook, int idCustomer) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Add Cart
		String query = "SELECT idBook FROM cart WHERE idBook=? AND idUser=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idBook);
		cmd.setInt(2, idCustomer);
		ResultSet rs = cmd.executeQuery(); 
		boolean result = rs.next();
		rs.close();
		cmd.close();
		return result;
	}
	
	public void orderCart(int idCustomer) throws Exception{
		List<CartBean> carts = getCarts(idCustomer);
		if (!carts.isEmpty()) {
			Date sqlDate = new Date(new java.util.Date().getTime());
			// Kết nối CSDL
//			cnn.ConnectionDB();
			for (CartBean cart: carts) {
				// Add Order
				String queryAddOrder = "INSERT INTO orders (idUser, dateBuy, haveBuy) VALUES (?, ?, ?)";
				PreparedStatement cmdAddOrder = cnn.prepareStatement(queryAddOrder);
				cmdAddOrder.setInt(1, idCustomer);
				cmdAddOrder.setDate(2, sqlDate);
				cmdAddOrder.setBoolean(3, false);
				cmdAddOrder.executeUpdate();
				// Get ID Cart
				int idOrder = 0;
				String queryGetMaxIDOrder = "SELECT idOrder FROM orders WHERE idOrder = (SELECT MAX(idOrder) FROM orders)";
				PreparedStatement cmdGetMaxIDOrder = cnn.prepareStatement(queryGetMaxIDOrder);
				ResultSet rs = cmdGetMaxIDOrder.executeQuery();        
				while (rs.next()) {
					idOrder = rs.getInt("idOrder");
					break;
				}
				// Add OrderDetail
				String queryAddOrderDetail = "INSERT INTO order_detail (idBook, quantityBuy, idOrder) VALUES (?, ?, ?)";
				PreparedStatement cmdAddOrderDetail = cnn.prepareStatement(queryAddOrderDetail);
				cmdAddOrderDetail.setInt(1, cart.getIdBook());
				cmdAddOrderDetail.setInt(2, cart.getQuantity());
				cmdAddOrderDetail.setInt(3, idOrder);
				cmdAddOrderDetail.executeUpdate();
				// Delete Cart
				String queryDeleteCart = "DELETE FROM cart WHERE idCart=?";
				PreparedStatement cmdDeleteCart = cnn.prepareStatement(queryDeleteCart);
				cmdDeleteCart.setLong(1, cart.getIdCart());
				cmdDeleteCart.executeUpdate();
				// Đóng CSDL
			}
		}
	}
	
	public void updateCart(int idCart, int quantity) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "UPDATE cart SET quantity=? WHERE idCart=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, quantity);
		cmd.setInt(2, idCart);
		cmd.executeUpdate();        
		// Đóng CSDL
		cmd.close();
	}
	
	public void deleteCart(int idCart) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "DELETE FROM cart WHERE idCart=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idCart);
		cmd.executeUpdate();        
		// Đóng CSDL
		cmd.close();
	}
}
