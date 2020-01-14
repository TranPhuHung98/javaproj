package temp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import connect_database.database;


public class DotNhanUngHoDao {
	Connection cnn = database.getConnect();
	
	public ArrayList<DotNhanUngHoBean> getDotNUHFromDatabase() {
		ArrayList<DotNhanUngHoBean> ds = new ArrayList<DotNhanUngHoBean>();
		try {
			
			PreparedStatement stmt = cnn.prepareStatement("SELECT MaDotNhanUngHo,MaHoDan,NgayNhanUngHo From DOT_NHAN_UNG_HO");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				DotNhanUngHoBean dotNUH = new DotNhanUngHoBean(result.getString(1), result.getString(2), result.getDate(3));
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
	
	public DotNhanUngHoBean getBooksByID(String id) throws Exception {
		ArrayList<DotNhanUngHoBean> ds = new ArrayList<DotNhanUngHoBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM DOT_NHAN_UNG_HO WHERE MaDotNhanUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, id);
		ResultSet rs = cmd.executeQuery();        

		while (rs.next()) {
			String maDNUH = rs.getString("MaDotNhanUngHo");
			String maHD = rs.getString("MaHoDan");
//			int quantity = rs.getInt("Quantity");
			Date ngayNUH = rs.getDate("NgayNhanUngHo");
			if(maDNUH.equals(id))
				ds.add(new DotNhanUngHoBean(maDNUH, maHD, ngayNUH));
		}	
		// Đóng CSDL
		cmd.close();
		rs.close();
		return ds.get(0);
	}
	
	
	
	public int delelteDotNUH(String maDNUH) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		String query = "DELETE FROM DOT_NHAN_UNG_HO WHERE MaDotNhanUngHo=?;";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, maDNUH);
		int rs = cmd.executeUpdate();	
		// Đóng CSDL
		cmd.close();
		return rs;
	}
}
