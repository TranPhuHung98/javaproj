package temp;

public class ChiTietDotDungHoBean {
	private String MaDUH;
	private String HinhThucUH;
	private int SoLuong;
	private String DonViTInh;
	public ChiTietDotDungHoBean(String maDUH, String hinhThucUH, int soLuong, String donViTInh) {
		super();
		MaDUH = maDUH;
		HinhThucUH = hinhThucUH;
		SoLuong = soLuong;
		DonViTInh = donViTInh;
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
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public String getDonViTInh() {
		return DonViTInh;
	}
	public void setDonViTInh(String donViTInh) {
		DonViTInh = donViTInh;
	}
	
	
}
