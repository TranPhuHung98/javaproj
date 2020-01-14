package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import controller.ConnectionDatabase;
import model.bean.CategoryBean;

public class CategoryDao {
	private ConnectionDatabase cnn = new ConnectionDatabase();
	
	public ArrayList<CategoryBean> getCategories() throws Exception {
		ArrayList<CategoryBean> categories = new ArrayList<CategoryBean>();
		// Kết nối CSDL
		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM Category";
		PreparedStatement cmd = cnn.connection.prepareStatement(query);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			String iDCategory = rs.getString("IDCategory");
			String name = rs.getString("Name");
			categories.add(new CategoryBean(iDCategory, name));
		}		
		// Đóng CSDL
		cnn.connection.close();
		return categories;
	}
	
	public ArrayList<CategoryBean> getCategoryByID(String id) throws Exception {
		ArrayList<CategoryBean> categories = new ArrayList<CategoryBean>();
		// Kết nối CSDL
		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM Category WHERE IDCategory=?";
		PreparedStatement cmd = cnn.connection.prepareStatement(query);
		cmd.setString(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			String iDCategory = rs.getString("IDCategory");
			String name = rs.getString("Name");
			categories.add(new CategoryBean(iDCategory, name));
		}		
		// Đóng CSDL
		cnn.connection.close();
		return categories;
	}
}
