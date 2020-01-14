package connect_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
private static Connection con = null;
	
	public static Connection getConnect() {
		if(con == null) {
			String url = "jdbc:mysql://localhost:3306/dangkyhocphan";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url,"root","root");
				System.out.println("connect");
			} catch (SQLException | ClassNotFoundException e) {
				System.out.println("not connect");
				e.printStackTrace();
			}
		}

		return con;
	}
}
