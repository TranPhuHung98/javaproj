package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import controller.ConnectionDatabase;
import model.bean.CustomerBean;

public class CustomerDao {
	Connection cnn = ConnectionDatabase.connectionDB();
	
	public CustomerBean getCustomer(String un, String pw) throws Exception {
		CustomerBean customer = null;
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM users WHERE email=? AND password=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, un);
		cmd.setString(2, pw);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDCustomer = rs.getInt("IDCustomer");
			String name = rs.getString("Name");
			String address = rs.getString("Address");
			String phone = rs.getString("Phone");
			String email = rs.getString("Email");
			String userName = rs.getString("UserName");
			String password = rs.getString("Password");
			customer = new CustomerBean(iDCustomer, name, address, phone, email, userName, password);
		}		
		// Đóng CSDL
		cmd.close();
		rs.close();
		return customer;
	}
}
