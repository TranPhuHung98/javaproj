package temp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import connect_database.database;

public class DotUngHoDao {
	Connection cnn = database.getConnect();
	public ArrayList<DotUngHoBean> getDotUHFromDatabase() {
		ArrayList<DotUngHoBean> ds = new ArrayList<DotUngHoBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT MaDotUngHo,MaDVUH,NgayUngHo From DOT_UNG_HO");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				DotUngHoBean dotNUH = new DotUngHoBean(result.getString(1), result.getString(2), result.getDate(3));
//				System.out.println(sach.getMaloai());
				ds.add(dotNUH);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
	
	public DotUngHoBean getDUHByID(String id) throws Exception {
		System.out.print("djt me may");
		ArrayList<DotUngHoBean> ds = new ArrayList<DotUngHoBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM DOT_UNG_HO WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			String maDUH = rs.getString("MaDotUngHo");
			String maDVUH = rs.getString("MaDVUH");
//			int quantity = rs.getInt("Quantity");
			Date ngayUH = rs.getDate("NgayUngHo");
			ds.add(new DotUngHoBean(maDUH, maDVUH, ngayUH));
		}	
		// Đóng CSDL
		cmd.close();
		rs.close();
		System.out.print(ds.get(0).getMaDVUH());
		return ds.get(0);
	}
	
	public boolean checkIDDotUH(String maDUH) throws Exception {
		// Nếu ID đã tồn tại, trả về TRUE
		String query = "SELECT MaDotUngHo FROM DOT_UNG_HO WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, maDUH);
		ResultSet rs = cmd.executeQuery(); 
		boolean result = rs.next();
		rs.close();
		return result;
	}
	
	public int addDotUH(String maDUH, String maDVUH, Date ngayUH) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		if (!checkIDDotUH(maDUH)) {
			System.out.println("vao day roi ne");
			System.out.println(ngayUH.toString() + "asdds");
			// Lấy CSDL
//			java.sql.Date sqlDate = new java.sql.Date(dateInput.getTime());
			String query = "INSERT INTO DOT_UNG_HO (MaDotUngHo, MaDVUH, NgayUngHo) VALUES (?, ?, ?)";
			PreparedStatement cmd = cnn.prepareStatement(query);
			java.sql.Date NgayDB = new java.sql.Date(ngayUH.getTime());
			cmd.setString(1, maDUH);
			cmd.setString(2, maDVUH);
			cmd.setDate(3, NgayDB);
			
			int rs = cmd.executeUpdate();
			cmd.close();
			return rs;
		}
		return 0;
	}
	
	public int updateDotUH(String maDUH, String maDVUH, Date ngayUH) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		
		String query = "UPDATE DOT_UNG_HO SET MaDVUH=?, NgayUngHo=? WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		java.sql.Date NgayDB = new java.sql.Date(ngayUH.getTime());
		cmd.setString(1, maDVUH);
		cmd.setDate(2, NgayDB);
		cmd.setString(3, maDUH);
		int rs = cmd.executeUpdate();	
		// Đóng CSDL
		cmd.close();
		return rs;
	}
}
