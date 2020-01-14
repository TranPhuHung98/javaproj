package model.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.CartBean;
import model.dao.CartDao;

public class CartBo {
	private CartDao cartDao = new CartDao();
	
	public ArrayList<CartBean> getCarts(int idCustomer) throws Exception {
		return cartDao.getCarts(idCustomer);
	}
	
	public void addCart(int idBook, int idCustomer, int quantity) throws Exception{
		cartDao.addCart(idBook, idCustomer, quantity);
	}
	
	public void updateCart(int idCart, int quantity) throws Exception {
		cartDao.updateCart(idCart, quantity);
	}
	
	public void deleteCart(int idCart) throws Exception {
		cartDao.deleteCart(idCart);
	}
	
	public void orderCart(int idCustomer) throws Exception {
		cartDao.orderCart(idCustomer);
	}
	
	public boolean checkCart(int idBook, int idCustomer) throws Exception {
		return cartDao.checkCart(idBook, idCustomer);
	}
}
