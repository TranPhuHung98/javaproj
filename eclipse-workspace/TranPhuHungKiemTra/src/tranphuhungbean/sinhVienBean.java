package tranphuhungbean;

import java.sql.Date;

public class sinhVienBean {

	private String maSinhVien;
	private String hoTenSinhVien;
	private Date ngaySinh;
	private String diaChi;
	private String maKhoa;
	private khoaBean khoa;

	public sinhVienBean(String maSinhVien, String hoTenSinhVien, Date ngaySinh, String diaChi, String maKhoa) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTenSinhVien = hoTenSinhVien;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.maKhoa = maKhoa;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTenSinhVien() {
		return hoTenSinhVien;
	}

	public void setHoTenSinhVien(String hoTenSinhVien) {
		this.hoTenSinhVien = hoTenSinhVien;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public khoaBean getKhoa() {
		return khoa;
	}

	public void setKhoa(khoaBean khoa) {
		this.khoa = khoa;
	}
	
	

}
