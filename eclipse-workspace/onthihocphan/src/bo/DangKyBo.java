package bo;

import java.util.ArrayList;

import bean.DangKyBean;
import dao.DangKyDao;

public class DangKyBo {
	DangKyDao  mh =new DangKyDao();
	public ArrayList<DangKyBean> getListDK() {
		return mh.getDKFromDatabase();
	}
	public ArrayList<DangKyBean> getListDKBySVId(String maSV) {
		return mh.getDangKyByIdSinhVien(maSV);
	}
}
