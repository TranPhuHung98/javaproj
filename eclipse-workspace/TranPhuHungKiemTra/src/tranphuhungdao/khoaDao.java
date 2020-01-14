package tranphuhungdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import tranphuhungbean.khoaBean;
import tranphuhungdb.db;

public class khoaDao {
	public ArrayList<khoaBean> getKhoaFromDatabase() {
		ArrayList<khoaBean> ds = new ArrayList<khoaBean>();
		try {
			Connection con = db.getConnect();
			PreparedStatement stmt = con.prepareStatement("SELECT maKhoa,tenKhoa From Khoa");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				khoaBean sach = new khoaBean(result.getString(1), result.getString(2));
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
