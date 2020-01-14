package tranphuhungdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import tranphuhungbean.sinhVienBean;
import tranphuhungdb.db;


public class sinhVienDao {
	
	public ArrayList<sinhVienBean> getSinhVienFromDatabase() {
		ArrayList<sinhVienBean> ds = new ArrayList<sinhVienBean>();
		try {
			Connection con = db.getConnect();
			PreparedStatement stmt = con.prepareStatement("SELECT MaSV,HoTenSV,NgaySinh,DiaChi,MaKhoa From SinhVien");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				sinhVienBean sach = new sinhVienBean(result.getString(1), result.getString(2), result.getDate(3),
						result.getString(4), result.getString(5));
//				System.out.println(sach.getMaloai());
				ds.add(sach);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
	
	public ArrayList<sinhVienBean> getSinhVienByMaKhoa(String maKhoa) {
		ArrayList<sinhVienBean> ds = new ArrayList<sinhVienBean>();
		try {
			Connection con = db.getConnect();
			String query = "SELECT MaSV,HoTenSV,NgaySinh,DiaChi,MaKhoa From SinhVien Where maKhoa=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, maKhoa);
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				sinhVienBean sach = new sinhVienBean(result.getString(1), result.getString(2), result.getDate(3),
						result.getString(4), result.getString(5));
//				System.out.println(sach.getMaloai());
				ds.add(sach);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
	

}
