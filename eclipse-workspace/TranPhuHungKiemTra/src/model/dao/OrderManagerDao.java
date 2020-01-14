package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import controller.ConnectionDatabase;
import model.bean.BookBean;
import model.bean.OrderBean;
import model.bean.OrderDetailBean;

public class OrderManagerDao {
	Connection cnn = ConnectionDatabase.connectionDB();
	
	public ArrayList<OrderBean> getOrderConfirmed() throws Exception {
		ArrayList<OrderBean> carts = new ArrayList<OrderBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM Orders WHERE HaveBuy=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setBoolean(1, true);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDOrder = rs.getInt("IDOrder");
			int iDCustomer = rs.getInt("IDCustomer");
			Date dateBuy = rs.getDate("DateBuy");
			boolean haveBuy = rs.getBoolean("HaveBuy");
			carts.add(new OrderBean(iDOrder, iDCustomer, dateBuy, haveBuy));
		}		
		// Đóng CSDL
		cnn.close();
		return carts;
	}
	
	public ArrayList<OrderBean> getOrderUnConfirm() throws Exception {
		ArrayList<OrderBean> carts = new ArrayList<OrderBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM Orders WHERE HaveBuy=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setBoolean(1, false);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDOrder = rs.getInt("IDOrder");
			int iDCustomer = rs.getInt("IDCustomer");
			Date dateBuy = rs.getDate("DateBuy");
			boolean haveBuy = rs.getBoolean("HaveBuy");
			carts.add(new OrderBean(iDOrder, iDCustomer, dateBuy, haveBuy));
		}		
		// Đóng CSDL
		cnn.close();
		return carts;
	}
	
	public OrderDetailBean getOrderDetailByID(long id) throws Exception {
		OrderDetailBean orderDetailBean = null;
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM OrderDetail WHERE IDOrder=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setLong(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDOrderDetail = rs.getInt("IDOrderDetail");
			int idBook = rs.getInt("IDBook");
			int quantityBuy = rs.getInt("QuantityBuy");
			int idOrder = rs.getInt("IDOrder");
			orderDetailBean = new OrderDetailBean(iDOrderDetail, idBook, quantityBuy, idOrder);
		}		
		// Đóng CSDL
		cnn.close();
		return orderDetailBean;
	}
	
	public int confirmOrder(long idOrder) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "UPDATE Orders SET HaveBuy=? WHERE IDOrder=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setBoolean(1, true);
		cmd.setLong(2, idOrder);
		int rs = cmd.executeUpdate();	
		// Đóng CSDL
		cmd.close();
		cnn.close();
		return rs;
	}
}
