package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import controller.ConnectionDatabase;
import model.bean.UserBean;

public class UserDao {
	Connection cnn = ConnectionDatabase.connectionDB();

	public ArrayList<UserBean> getUser(String un, String pw) throws Exception {
		HttpServletRequest request;
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		System.out.print(un);
		System.out.print("dasdasdsdasasdasdasd");
		String query = "SELECT * FROM users WHERE email=? AND password=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, un);
		cmd.setString(2, pw);
		ResultSet rs = cmd.executeQuery();
		System.out.print(un);
		System.out.print(pw);

		while (rs.next()) {
			String userName = rs.getString("email");
			String password = rs.getString("password");
			int id = rs.getInt("idUser");
			int a = rs.getInt("permission");
			boolean premission = a == 0 ? false : true;
			users.add(new UserBean(id, userName, password, premission));
		}
		// Đóng CSDL
		cmd.close();
		rs.close();
		return users;
	}
	
	public UserBean getUserByID(int id) throws Exception {
		UserBean User = null;
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM users WHERE idUser=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setLong(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDUser = rs.getInt("idUser");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			Boolean permission = rs.getInt("permission")==0?false:true;
			String password = rs.getString("password");
			User = new UserBean(iDUser, email, password,permission);
			break;
		}		
		// Đóng CSDL
		cmd.close();
		return User;
	}
}
