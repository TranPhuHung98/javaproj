package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import controller.ConnectionDatabase;
import model.bean.BookBean;

public class BookDao {
	Connection cnn = ConnectionDatabase.connectionDB();
	
	public ArrayList<BookBean> getAllBooks() throws Exception {
		ArrayList<BookBean> books = new ArrayList<BookBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM books";
		PreparedStatement cmd = cnn.prepareStatement(query);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDBook = rs.getInt("idBook");
			String name = rs.getString("name");
//			int quantity = rs.getInt("Quantity");
			int price = rs.getInt("price");
			int iDCategory = rs.getInt("category_id");
			String image = rs.getString("image");
//			Date dateInput = rs.getDate("DateInput");
			String author = rs.getString("author");
			books.add(new BookBean(iDBook, name, price, iDCategory, image, author));
		}		
		// Đóng CSDL
		cmd.close();
		rs.close();
		return books;
	}
	
	public ArrayList<BookBean> getBooksByID(int id) throws Exception {
		ArrayList<BookBean> books = new ArrayList<BookBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM books WHERE idBook=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDBook = rs.getInt("idBook");
			String name = rs.getString("name");
//			int quantity = rs.getInt("Quantity");
			int price = rs.getInt("price");
			int iDCategory = rs.getInt("category_id");
			String image = rs.getString("image");
//			Date dateInput = rs.getDate("DateInput");
			String author = rs.getString("author");
			books.add(new BookBean(iDBook, name, price, iDCategory, image, author));
		}	
		// Đóng CSDL
		cmd.close();
		rs.close();
		return books;
	}
	
	public ArrayList<BookBean> getBooksByCategory(int idCategory) throws Exception {
		ArrayList<BookBean> books = new ArrayList<BookBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM books WHERE category_id=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idCategory);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			int iDBook = rs.getInt("idBook");
			String name = rs.getString("name");
//			int quantity = rs.getInt("Quantity");
			int price = rs.getInt("price");
			int iDCategory = rs.getInt("category_id");
			String image = rs.getString("image");
//			Date dateInput = rs.getDate("DateInput");
			String author = rs.getString("author");
			books.add(new BookBean(iDBook, name, price, iDCategory, image, author));
		}	
		// Đóng CSDL
		cmd.close();
		rs.close();
		return books;
	}
	
	public boolean checkIDBook(int idBook) throws Exception {
		// Nếu ID đã tồn tại, trả về TRUE
		String query = "SELECT idBook FROM books WHERE idBook=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idBook);
		ResultSet rs = cmd.executeQuery(); 
		boolean result = rs.next();
		rs.close();
		return result;
	}
	
	public int addBook(int iDBook, String name, int price, int iDCategory, String image, String author) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		if (!checkIDBook(iDBook)) {
			// Lấy CSDL
//			java.sql.Date sqlDate = new java.sql.Date(dateInput.getTime());
			String query = "INSERT INTO books (idBook, name, author, image, category_id, price) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement cmd = cnn.prepareStatement(query);
			cmd.setInt(1, iDBook);
			cmd.setString(2, name);
			cmd.setString(3, author);
			cmd.setString(4, image);
			cmd.setInt(5, iDCategory);
			cmd.setInt(6, price);
			
			int rs = cmd.executeUpdate();	
			// Đóng CSDL
			cmd.close();
			cnn.close();
			return rs;
		}
		return 0;
	}
	
	public int updateBook(int iDBook, String name, int price, int iDCategory, String image, String author) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		String query = "UPDATE books SET name=?, author=?, image=?, category_id=?, price=? WHERE idBook=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, name);
		cmd.setString(2, author);
		cmd.setString(3, image);
		cmd.setInt(4, iDCategory);
		cmd.setInt(5, price);
	
		
		cmd.setInt(6, iDBook);
		int rs = cmd.executeUpdate();	
		// Đóng CSDL
		cmd.close();
		cnn.close();
		return rs;
	}
	
	public int delelteBook(int idBook) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		String query = "DELETE FROM books WHERE idBook=?;";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setInt(1, idBook);
		int rs = cmd.executeUpdate();	
		// Đóng CSDL
		cmd.close();
		cnn.close();
		return rs;
	}
}
