package tranphuhungbean;

public class hangbean {
	private int maHang;
	private String tenHang;
	private String tenNCC;
	private int soLuong;
	private int gia;
	private String anh;
	private String description;
	
	public hangbean(int maHang, String tenHang, String tenNCC, int soLuong, int gia, String anh, String description) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.tenNCC = tenNCC;
		this.soLuong = soLuong;
		this.gia = gia;
		this.anh = anh;
		this.description = description;
	}
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getDes() {
		return description;
	}
	public void setDes(String des) {
		this.description = des;
	}
	
}
