package temp;

import java.util.ArrayList;

public class ChiTietDotUngHoBo {
	ChiTietDotUngHoDao  ctduh =new ChiTietDotUngHoDao();
	public ArrayList<ChiTietDotUngHoBean> getListDotUH() {
		return ctduh.getChiTietDUHFromDatabase();
	}
	public ChiTietDotUngHoBean getDotUHById(String id) throws Exception {
		return ctduh.getCTDUHByID(id);
	}
	public int updateCTDUH(String maDUH, String hinhThucUH, int soLuongUH, String donViTinh) throws Exception {
		return ctduh.updateDotUH(maDUH, hinhThucUH, soLuongUH, donViTinh);
	}
	
	public int addCTDUH(String maDUH, String hinhThucUH, int soLuongUH, String donViTinh) throws Exception {
		return ctduh.addChiTietDUH(maDUH, hinhThucUH, soLuongUH, donViTinh);
	}
}
