package temp;

import java.util.ArrayList;

public class DotNhanUngHoBo {
	DotNhanUngHoDao  dotNUH =new DotNhanUngHoDao();
	public ArrayList<DotNhanUngHoBean> getListDotNUH() {
		return dotNUH.getDotNUHFromDatabase();
	}
	public int deleteDotNUH(String maDNUH) throws Exception {
		return dotNUH.delelteDotNUH(maDNUH);
	}
	
	public DotNhanUngHoBean getDotNUHById(String id) throws Exception {
		return dotNUH.getBooksByID(id);
	}
}
