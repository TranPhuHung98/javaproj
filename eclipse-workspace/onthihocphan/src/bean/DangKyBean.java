package bean;

public class DangKyBean {
	private String MaSV;
	private String MaMH;

	public DangKyBean(String maSV, String maMH) {
		super();
		MaSV = maSV;
		MaMH = maMH;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getMaMH() {
		return MaMH;
	}

	public void setMaMH(String maMH) {
		MaMH = maMH;
	};

}
