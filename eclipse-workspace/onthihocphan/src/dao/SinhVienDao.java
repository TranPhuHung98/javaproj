package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.DangKyBean;
import bean.MonHocBean;
import bean.SinhVienBean;
import bo.DangKyBo;
import bo.MonHocBo;
import connect_database.database;

public class SinhVienDao {
	Connection cnn = database.getConnect();

	public ArrayList<SinhVienBean> getSinhVienromDatabase() {
		ArrayList<SinhVienBean> ds = new ArrayList<SinhVienBean>();
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT * From SINHVIEN");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				System.out.println("jsakdasdasdkjasd");
				SinhVienBean sv = new SinhVienBean(result.getString(1), result.getString(2), result.getDate(3), result.getString(4),
						result.getString(5), result.getString(6), result.getString(7), result.getString(8));
//				System.out.println(sach.getMaloai());
				ds.add(sv);
			}
			result.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		return ds;
	}
	
	public int getTongSoTinChiDaDK(String maSV) throws Exception {
		int sum = 0;
		ArrayList<DangKyBean> dks = new ArrayList<DangKyBean>();
		DangKyBo dkb = new DangKyBo();
		MonHocBo mhb = new MonHocBo();
		dks = dkb.getListDKBySVId(maSV);
		for (DangKyBean dk : dks) {
			MonHocBean mh = mhb.getMonHocById(dk.getMaMH());
			sum+=mh.getSoTinChi();
		}
		return sum;
	}
}
