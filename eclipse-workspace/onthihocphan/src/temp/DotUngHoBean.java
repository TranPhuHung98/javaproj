package temp;

import java.util.Date;

public class DotUngHoBean {
	private String MaDUH;
	private String MaDVUH;
	private Date NgayUH;
	public DotUngHoBean(String maDUH, String maDVUH, Date ngayUH) {
		super();
		MaDUH = maDUH;
		MaDVUH = maDVUH;
		NgayUH = ngayUH;
	}
	public String getMaDUH() {
		return MaDUH;
	}
	public void setMaDUH(String maDUH) {
		MaDUH = maDUH;
	}
	public String getMaDVUH() {
		return MaDVUH;
	}
	public void setMaDVUH(String maDVUH) {
		MaDVUH = maDVUH;
	}
	public Date getNgayUH() {
		return NgayUH;
	}
	public void setNgayUH(Date ngayUH) {
		NgayUH = ngayUH;
	}
	
}
