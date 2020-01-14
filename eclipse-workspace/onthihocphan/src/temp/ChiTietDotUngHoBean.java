package temp;

public class ChiTietDotUngHoBean {
	private String MaDUH;
	private String HinhThucUH;
	private int SoLuongUH;
	private String DonViTinh;
	public ChiTietDotUngHoBean(String maDUH, String hinhThucUH, int soLuongUH, String donViTinh) {
		super();
		MaDUH = maDUH;
		HinhThucUH = hinhThucUH;
		SoLuongUH = soLuongUH;
		DonViTinh = donViTinh;
	}
	public String getMaDUH() {
		return MaDUH;
	}
	public void setMaDUH(String maDUH) {
		MaDUH = maDUH;
	}
	public String getHinhThucUH() {
		return HinhThucUH;
	}
	public void setHinhThucUH(String hinhThucUH) {
		HinhThucUH = hinhThucUH;
	}
	public int getSoLuongUH() {
		return SoLuongUH;
	}
	public void setSoLuongUH(int soLuongUH) {
		SoLuongUH = soLuongUH;
	}
	public String getDonViTinh() {
		return DonViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}
	
	
}
