package controller;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

	private static Connection con = null;

	public static Connection connectionDB() {
//		// B1: Xác định HQTCSDL
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
////		// B2: Kết nối vào CSDL
//		String url = "jdbc:sqlserver://PC:1433;databaseName=BookStore;user=sa; password=123456";
//		connection = DriverManager.getConnection(url);
//		System.out.println("Connect DB Success!!");
//		try {
//		    String dbURL = "jdbc:sqlserver://localhost;databaseName=BookStore;user=sa;password=123456";
//		    Connection conn = DriverManager.getConnection(dbURL);
//		    if (conn != null) {
//		      System.out.println("Connected");
//		      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//		      System.out.println("Driver name: " + dm.getDriverName());
//		      System.out.println("Driver version: " + dm.getDriverVersion());
//		      System.out.println("Product name: " + dm.getDatabaseProductName());
//		      System.out.println("Product version: " + dm.getDatabaseProductVersion());
//		    }
//		   } catch (SQLException ex) {
//		     System.err.println("Cannot connect database, " + ex);
//		   }
		if (con == null) {
			String url = "jdbc:mysql://localhost:3306/QlSach";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, "root", "root");
				System.out.println("connect");
			} catch (SQLException | ClassNotFoundException e) {
				System.out.println("not connect");
				e.printStackTrace();
			}
		}

		return con;
	}
}
