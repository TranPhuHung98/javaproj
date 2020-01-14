package temp;

public class ChiTietDotNhanUngHoBean {
	private String MaDNUH;
	private String HinhThucNUH;
	private int SoLuongNUH;
	private String DonViTinh;
	public ChiTietDotNhanUngHoBean(String maDNUH, String hinhThucNUH, int soLuongNUH, String donViTinh) {
		super();
		MaDNUH = maDNUH;
		HinhThucNUH = hinhThucNUH;
		SoLuongNUH = soLuongNUH;
		DonViTinh = donViTinh;
	}
	public String getMaDNUH() {
		return MaDNUH;
	}
	public void setMaDNUH(String maDNUH) {
		MaDNUH = maDNUH;
	}
	public String getHinhThucNUH() {
		return HinhThucNUH;
	}
	public void setHinhThucNUH(String hinhThucNUH) {
		HinhThucNUH = hinhThucNUH;
	}
	public int getSoLuongNUH() {
		return SoLuongNUH;
	}
	public void setSoLuongNUH(int soLuongNUH) {
		SoLuongNUH = soLuongNUH;
	}
	public String getDonViTinh() {
		return DonViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}
	
}
