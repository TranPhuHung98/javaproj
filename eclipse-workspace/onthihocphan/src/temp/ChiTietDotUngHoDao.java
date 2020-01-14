package temp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import connect_database.database;

public class ChiTietDotUngHoDao {
	Connection cnn = database.getConnect();

	public ArrayList<ChiTietDotUngHoBean> getChiTietDUHFromDatabase() {
		ArrayList<ChiTietDotUngHoBean> ds = new ArrayList<ChiTietDotUngHoBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement(
					"SELECT MaDotUngHo,HinhThucUngHo,SoLuongUngHo,DonViTinh From CHI_TIET_DOT_UNG_HO");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				ChiTietDotUngHoBean dotNUH = new ChiTietDotUngHoBean(result.getString(1), result.getString(2),
						result.getInt(3), result.getString(4));
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

	public ChiTietDotUngHoBean getCTDUHByID(String id) throws Exception {
		System.out.print("djt me may");
		ArrayList<ChiTietDotUngHoBean> ds = new ArrayList<ChiTietDotUngHoBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM CHI_TIET_DOT_UNG_HO WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, id);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String maDUH = rs.getString("MaDotUngHo");
			String maDVUH = rs.getString("HinhThucUngHo");
			int soLuong = rs.getInt("SoLuongUngHo");
			String donViTinh = rs.getString("DonViTinh");
			ds.add(new ChiTietDotUngHoBean(maDUH, maDVUH, soLuong, donViTinh));
		}
		// Đóng CSDL
		cmd.close();
		rs.close();
		System.out.print(ds.get(0).getMaDUH());
		return ds.get(0);
	}

	public boolean checkIDDotUH(String maDUH) throws Exception {
		// Nếu ID đã tồn tại, trả về TRUE
		String query = "SELECT MaDotUngHo FROM CHI_TIET_DOT_UNG_HO WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, maDUH);
		ResultSet rs = cmd.executeQuery();
		boolean result = rs.next();
		rs.close();
		return result;
	}

	public int addChiTietDUH(String maDUH, String hinhThucUH, int soLuongUH, String donViTinh) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		System.out.println("klkkkkll");
		// Kiểm tra ID
		if (!checkIDDotUH(maDUH)) {
			System.out.println("lllllllll");
			// Lấy CSDL
//			java.sql.Date sqlDate = new java.sql.Date(dateInput.getTime());
			String query = "INSERT INTO CHI_TIET_DOT_UNG_HO (MaDotUngHo, HinhThucUngHo, SoLuongUngHo, DonViTinh) VALUES (?, ?, ?,?)";
			PreparedStatement cmd = cnn.prepareStatement(query);

			cmd.setString(1, maDUH);
			cmd.setString(2, hinhThucUH);
			cmd.setInt(3, soLuongUH);
			cmd.setString(4, donViTinh);
			
			int rs = cmd.executeUpdate();
			cmd.close();
			return rs;
		}
		return 0;
	}

	public int updateDotUH(String maDUH, String hinhThucUH, int soLuongUH, String donViTinh) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		System.out.println("aksjdbas dbaskdbasjkdb aksjd kajas");
		String query = "UPDATE CHI_TIET_DOT_UNG_HO SET HinhThucUngHo=?, SoLuongUngHo=?,DonViTinh=? WHERE MaDotUngHo=?";
		PreparedStatement cmd = cnn.prepareStatement(query);

		cmd.setString(4, maDUH);
		cmd.setString(1, hinhThucUH);
		cmd.setInt(2, soLuongUH);
		cmd.setString(3, donViTinh);
		
		int rs = cmd.executeUpdate();
		// Đóng CSDL
		cmd.close();
		return rs;
	}
}
