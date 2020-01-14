package tranphuhungbo;

import java.util.ArrayList;

import tranphuhungbean.khoaBean;
import tranphuhungbean.sinhVienBean;
import tranphuhungdao.khoaDao;
import tranphuhungdao.sinhVienDao;

public class khoaBo {
	khoaDao  khoa =new khoaDao();
	public ArrayList<khoaBean> getKhoa() {
		return khoa.getKhoaFromDatabase();
	}
	
	public khoaBean getKhoaById(String id) {
		ArrayList<khoaBean> dsKhoa = getKhoa();
		khoaBean khoa = null;
		for(khoaBean k:dsKhoa) {
			if(k.getMaKhoa().compareTo(id) == 0) {
				khoa = k;
				break;
			}
		}
		return khoa;
	}
}
