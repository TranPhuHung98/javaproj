package temp;

import java.util.ArrayList;
import java.util.Date;

public class DotUngHoBo {
	
	DotUngHoDao  dotUH =new DotUngHoDao();
	public ArrayList<DotUngHoBean> getListDotUH() {
		return dotUH.getDotUHFromDatabase();
	}
	public int updateDotUH(String maDUH,String maDVUH,Date ngayUH) throws Exception {
		return dotUH.updateDotUH(maDUH, maDVUH, ngayUH);
	}
	
	public int addDotNUH(String maDUH,String maDVUH,Date ngayUH) throws Exception {
		return dotUH.addDotUH(maDUH, maDVUH, ngayUH);
	}
	
	public DotUngHoBean getDotUHById(String id) throws Exception {
		return dotUH.getDUHByID(id);
	}

}
