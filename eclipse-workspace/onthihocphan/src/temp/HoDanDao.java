package temp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connect_database.database;

public class HoDanDao {
	Connection cnn = database.getConnect();

	public ArrayList<ChiTietDotNhanUngHoBean> getCTDNUHFromDatabase() {
		ArrayList<ChiTietDotNhanUngHoBean> ds = new ArrayList<ChiTietDotNhanUngHoBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement(
					"SELECT MaDotNhanUngHo,HinhThucNhanUngHo,SoLuongNhanUngHo,DonViTinh FROM CHI_TIET_DOT_NHAN_UNG_HO ORDER BY SoLuongNhanUngHo DESC");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				ChiTietDotNhanUngHoBean ctdnuh = new ChiTietDotNhanUngHoBean(result.getString(1), result.getString(2),
						result.getInt(3), result.getString(4));
//				System.out.println(sach.getMaloai());
				ds.add(ctdnuh);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}

	public HoDanBean getHoDanById(String id) {
		System.out.println("vao ham" + id);
		ArrayList<HoDanBean> ds = new ArrayList<HoDanBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement(
					"SELECT * FROM HO_DAN");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				System.out.println("query duoc");
				HoDanBean hd = new HoDanBean(result.getString(1), result.getString(2), result.getInt(3),
						result.getString(4), result.getString(5), result.getString(6), result.getInt(7),
						result.getString(8), result.getString(9));
//				System.out.println(sach.getMaloai());
				if (result.getString(1).equals(id))
					ds.add(hd);
			}

			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return ds.get(0);
	}
}
