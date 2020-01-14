package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.MonHocBean;
import dao.MonHocDao;


public class MonHocBo {
	MonHocDao  mh =new MonHocDao();
	public ArrayList<MonHocBean> getListDotUH() {
		return mh.getMonHocromDatabase();
	}
	public int updateDotUH(String mamh,String tenmh,int stc,int sb,int ssvtt,int ssvtd,int ssvdk,Date ngaynh,Date ngayhh) throws Exception {
		return mh.updateDotUH(mamh, tenmh, stc, sb, ssvtt, ssvtd, ssvdk, ngaynh, ngayhh);
	}
	
	public int addDotNUH(String mamh,String tenmh,int stc,int sb,int ssvtt,int ssvtd,int ssvdk,Date ngaynh,Date ngayhh) throws Exception {
		return mh.addMonHoc(mamh, tenmh, stc, sb, ssvtt, ssvtd, ssvdk, ngaynh, ngayhh);
	}
	
	public MonHocBean getMonHocById(String id) throws Exception {
		return mh.getMonHocByID(id);
	}
	
	public int deleteDotNUH(String maMH) throws Exception {
		return mh.delelteMonHoc(maMH);
	}
}
