package temp;

import java.util.ArrayList;

public class ChiTietDotNhanUngHoBo {
	HoDanDao  hd =new HoDanDao();
	public ArrayList<ChiTietDotNhanUngHoBean> getListCTDNUH() {
		return hd.getCTDNUHFromDatabase();
	}
	public HoDanBean getHoDanById(String id) {
		return hd.getHoDanById(id);
	}
}
