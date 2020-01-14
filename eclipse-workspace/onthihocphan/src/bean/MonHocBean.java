package bean;

import java.util.Date;

public class MonHocBean {
	private String MaMH;
	private String TenMH;
	private int SoTinChi;
	private int SoBuoi;
	private int SoSVToiThieu;
	private int SoSVToiDa;
	private int SoSVDangKy;
	private Date NgayNhapHoc;
	private Date NgayHetHang;

	public MonHocBean(String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu, int soSVToiDa,
			int soSVDangKy, Date ngayNhapHoc, Date ngayHetHang) {
		super();
		MaMH = maMH;
		TenMH = tenMH;
		SoTinChi = soTinChi;
		SoBuoi = soBuoi;
		SoSVToiThieu = soSVToiThieu;
		SoSVToiDa = soSVToiDa;
		SoSVDangKy = soSVDangKy;
		NgayNhapHoc = ngayNhapHoc;
		NgayHetHang = ngayHetHang;
	}

	public String getMaMH() {
		return MaMH;
	}

	public void setMaMH(String maMH) {
		MaMH = maMH;
	}

	public String getTenMH() {
		return TenMH;
	}

	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}

	public int getSoTinChi() {
		return SoTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		SoTinChi = soTinChi;
	}

	public int getSoBuoi() {
		return SoBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		SoBuoi = soBuoi;
	}

	public int getSoSVToiThieu() {
		return SoSVToiThieu;
	}

	public void setSoSVToiThieu(int soSVToiThieu) {
		SoSVToiThieu = soSVToiThieu;
	}

	public int getSoSVToiDa() {
		return SoSVToiDa;
	}

	public void setSoSVToiDa(int soSVToiDa) {
		SoSVToiDa = soSVToiDa;
	}

	public int getSoSVDangKy() {
		return SoSVDangKy;
	}

	public void setSoSVDangKy(int soSVDangKy) {
		SoSVDangKy = soSVDangKy;
	}

	public Date getNgayNhapHoc() {
		return NgayNhapHoc;
	}

	public void setNgayNhapHoc(Date ngayNhapHoc) {
		NgayNhapHoc = ngayNhapHoc;
	}

	public Date getNgayHetHang() {
		return NgayHetHang;
	}

	public void setNgayHetHang(Date ngayHetHang) {
		NgayHetHang = ngayHetHang;
	}

}
