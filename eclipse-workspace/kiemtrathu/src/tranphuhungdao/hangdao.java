package tranphuhungdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.db;
import tranphuhungbean.hangbean;

public class hangdao {
	
	public ArrayList<hangbean> getHangFromDatabase() {
		ArrayList<hangbean> ds = new ArrayList<hangbean>();
		try {
			Connection con = db.getConnect();
			PreparedStatement stmt = con.prepareStatement("SELECT maHang,tenHang,tenNCC,soLuong,gia,anh,description From TranPhuHung");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				hangbean sach = new hangbean(result.getInt(1), result.getString(2), result.getString(3),
						result.getInt(4), result.getInt(5), result.getString(6),result.getString(7));
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
	
	public hangbean getHangById(int id) {
		ArrayList<hangbean> ds = getHangFromDatabase();
		hangbean kq = null;
		for(hangbean hang:ds) {
			if(hang.getMaHang() == id)
			{
				kq = hang;
			}
		}
		return kq;
	}
	
	public ArrayList<hangbean> getHangByName(String name) {
		ArrayList<hangbean> ds = getHangFromDatabase();
		ArrayList<hangbean> dskq = new ArrayList<hangbean>();
		for(hangbean hang:ds) {
			if(hang.getTenHang().contains(name))
			{
				dskq.add(hang);
			}
		}
		return dskq;
	}
}
