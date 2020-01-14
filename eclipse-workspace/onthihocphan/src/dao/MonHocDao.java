package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.MonHocBean;
import connect_database.database;

public class MonHocDao {
	Connection cnn = database.getConnect();

	public ArrayList<MonHocBean> getMonHocromDatabase() {
		ArrayList<MonHocBean> ds = new ArrayList<MonHocBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT * From MONHOC");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				MonHocBean mh = new MonHocBean(result.getString(1), result.getString(2), result.getInt(3),
						result.getInt(4), result.getInt(5), result.getInt(6), result.getInt(7), result.getDate(8),
						result.getDate(9));
//				System.out.println(sach.getMaloai());
				ds.add(mh);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}

	public MonHocBean getMonHocByID(String id) throws Exception {
		System.out.print("djt me may");
		ArrayList<MonHocBean> ds = new ArrayList<MonHocBean>();
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Lấy CSDL
		String query = "SELECT * FROM MONHOC WHERE MaMH=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, id);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String maMH = rs.getString("MaMH");
			String tenMH = rs.getString("TenMH");
			int stc = rs.getInt("SoTinChi");
			int sb = rs.getInt("SoBuoi");
			int ssvtt = rs.getInt("SoSVToiThieu");
			int ssvtd = rs.getInt("SoSVToiDa");
			int ssvdk = rs.getInt("SoSVDangKy");
			Date ngaynh = rs.getDate("NgayNhapHoc");
			Date ngayhh = rs.getDate("NgayHetHang");
			ds.add(new MonHocBean(maMH, tenMH, stc, sb, ssvtt, ssvtd, ssvdk, ngaynh, ngayhh));
		}
		// Đóng CSDL
		cmd.close();
		rs.close();
		return ds.get(0);
	}

	public boolean checkIDMonHoc(String maDUH) throws Exception {
		// Nếu ID đã tồn tại, trả về TRUE
		String query = "SELECT MaMH FROM MONHOC WHERE MaMH=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, maDUH);
		ResultSet rs = cmd.executeQuery();
		boolean result = rs.next();
		rs.close();
		return result;
	}

	public int addMonHoc(String mamh, String tenmh, int stc, int sb, int ssvtt, int ssvtd, int ssvdk, Date ngaynh,
			Date ngayhh) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		if (!checkIDMonHoc(mamh)) {
			System.out.println("vao day roi ne");
			System.out.println(mamh.toString() + "asdds");
			// Lấy CSDL
//			java.sql.Date sqlDate = new java.sql.Date(dateInput.getTime());
			String query = "INSERT INTO MONHOC (MaMH, TenMH, SoTinChi,SoBuoi,SoSVToiThieu,SoSVToiDa,SoSVDangKy,NgayNhapHoc,NgayHetHang) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement cmd = cnn.prepareStatement(query);
			java.sql.Date NgayNH = new java.sql.Date(ngaynh.getTime());
			java.sql.Date NgayHH = new java.sql.Date(ngayhh.getTime());
			cmd.setString(1, mamh);
			cmd.setString(2, tenmh);
			cmd.setInt(3, stc);
			cmd.setInt(4, sb);
			cmd.setInt(5, ssvtt);
			cmd.setInt(6, ssvtd);
			cmd.setInt(7, ssvdk);
			cmd.setDate(8, NgayNH);
			cmd.setDate(9, NgayHH);

			int rs = cmd.executeUpdate();
			cmd.close();
			return rs;
		}
		return 0;
	}

	public int updateDotUH(String mamh, String tenmh, int stc, int sb, int ssvtt, int ssvtd, int ssvdk, Date ngaynh,
			Date ngayhh) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL

		String query = "UPDATE MONHOC SET TenMH=?, SoTinChi=?,SoBuoi=?,SoSVToiThieu=?,SoSVToiDa=?,SoSVDangKy=?,NgayNhapHoc=?,NgayHetHang=? WHERE MaMH=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		java.sql.Date NgayNH = new java.sql.Date(ngaynh.getTime());
		java.sql.Date NgayHH = new java.sql.Date(ngayhh.getTime());
		cmd.setString(9, mamh);
		cmd.setString(1, tenmh);
		cmd.setInt(2, stc);
		cmd.setInt(3, sb);
		cmd.setInt(4, ssvtt);
		cmd.setInt(5, ssvtd);
		cmd.setInt(6, ssvdk);
		cmd.setDate(7, NgayNH);
		cmd.setDate(8, NgayHH);
		int rs = cmd.executeUpdate();
		// Đóng CSDL
		cmd.close();
		return rs;
	}

	public boolean checkMonHocDaDangKy(String maMH) throws Exception {
		// Nếu ID đã tồn tại, trả về TRUE
		String query = "SELECT MaMH FROM DANGKY WHERE MaMH=?";
		PreparedStatement cmd = cnn.prepareStatement(query);
		cmd.setString(1, maMH);
		ResultSet rs = cmd.executeQuery();
		boolean result = rs.next();
		rs.close();
		return result;
	}

	public int delelteMonHoc(String maMH) throws Exception {
		// Kết nối CSDL
//		cnn.ConnectionDB();
		// Kiểm tra ID
		// Lấy CSDL
		if (checkMonHocDaDangKy(maMH)) {
			String query = "DELETE FROM MONHOC WHERE MaMH=?;";
			PreparedStatement cmd = cnn.prepareStatement(query);
			cmd.setString(1, maMH);
			int rs = cmd.executeUpdate();
			// Đóng CSDL
			cmd.close();
			return rs;
		}
		return 0;
	}
}
