package bo;

import java.util.ArrayList;

import bean.SinhVienBean;
import dao.SinhVienDao;

public class SinhVienBo {
	SinhVienDao  sv =new SinhVienDao();
	public ArrayList<SinhVienBean> getListSV() {
		return sv.getSinhVienromDatabase();
	}
	public int getSumTinChiById(String maSV) throws Exception {
		return sv.getTongSoTinChiDaDK(maSV);
	}
}
