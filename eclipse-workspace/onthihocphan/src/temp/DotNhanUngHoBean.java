package temp;

import java.util.Date;

public class DotNhanUngHoBean {
	private String MaDNUH;
	private String MaHoDan;
	private Date NgayNhanUH;
	public DotNhanUngHoBean(String maDNUH, String maHoDan, Date ngayNhanUH) {
		super();
		MaDNUH = maDNUH;
		MaHoDan = maHoDan;
		NgayNhanUH = ngayNhanUH;
	}
	public String getMaDNUH() {
		return MaDNUH;
	}
	public void setMaDNUH(String maDNUH) {
		MaDNUH = maDNUH;
	}
	public String getMaHoDan() {
		return MaHoDan;
	}
	public void setMaHoDan(String maHoDan) {
		MaHoDan = maHoDan;
	}
	public Date getNgayNhanUH() {
		return NgayNhanUH;
	}
	public void setNgayNhanUH(Date ngayNhanUH) {
		NgayNhanUH = ngayNhanUH;
	}
}
