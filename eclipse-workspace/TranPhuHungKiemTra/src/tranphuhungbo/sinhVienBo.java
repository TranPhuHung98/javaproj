package tranphuhungbo;

import java.util.ArrayList;

import tranphuhungbean.sinhVienBean;
import tranphuhungdao.sinhVienDao;

public class sinhVienBo {
	sinhVienDao sinhVien = new sinhVienDao();

	public ArrayList<sinhVienBean> getSinhVien() {
		khoaBo kBo = new khoaBo();
		ArrayList<sinhVienBean> dsSV = sinhVien.getSinhVienFromDatabase();
		for(sinhVienBean sv: dsSV) {
			sv.setKhoa(kBo.getKhoaById(sv.getMaKhoa()));
		}
		return dsSV;
	}

	public ArrayList<sinhVienBean> getSinhVienByMaKhoa(String maKhoa) {
		khoaBo kBo = new khoaBo();
		ArrayList<sinhVienBean> dsSV = sinhVien.getSinhVienByMaKhoa(maKhoa);
		for(sinhVienBean sv: dsSV) {
			sv.setKhoa(kBo.getKhoaById(sv.getMaKhoa()));
		}
		return dsSV;
	}

	public ArrayList<sinhVienBean> getSinhVienByHoTenDiaChi(String key) {
		ArrayList<sinhVienBean> dsSV = getSinhVien();
		ArrayList<sinhVienBean> dsKQ = new ArrayList<sinhVienBean>();

		for (sinhVienBean sv : dsSV) {
			if (sv.getHoTenSinhVien().toLowerCase().contains(key.toLowerCase())
					|| sv.getDiaChi().toLowerCase().contains(key.toLowerCase()))
				dsKQ.add(sv);
		}

		return dsKQ;
	}
}
