package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.DangKyBean;
import connect_database.database;

public class DangKyDao {
	Connection cnn = database.getConnect();

	public ArrayList<DangKyBean> getDKFromDatabase() {
		ArrayList<DangKyBean> ds = new ArrayList<DangKyBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT * From DANGKY");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				System.out.println("jsakdasdasdkjasd");
				DangKyBean dk = new DangKyBean(result.getString(1), result.getString(2));
//				System.out.println(sach.getMaloai());
				ds.add(dk);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
	
	public ArrayList<DangKyBean> getDangKyByIdSinhVien(String masv) {
		ArrayList<DangKyBean> ds = new ArrayList<DangKyBean>();
		try {
			String query = "SELECT * FROM DANGKY WHERE MaSV=?";
			PreparedStatement cmd = cnn.prepareStatement(query);
			cmd.setString(1, masv);
			ResultSet rs = cmd.executeQuery();

			while (rs.next()) {
				System.out.println("jsakdasdasdkjasd");
				DangKyBean dk = new DangKyBean(rs.getString(1), rs.getString(2));
//				System.out.println(sach.getMaloai());
				ds.add(dk);
			}
			rs.close();
			cmd.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
}
