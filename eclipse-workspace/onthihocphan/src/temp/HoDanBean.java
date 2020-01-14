package temp;

public class HoDanBean {
	private String MaHoDan;
	private String HoTenChuHo;
	private int To;
	private String KhoiHoacThon;
	private String SoDienThoai;
	private String DiaChiNha;
	private int SoNhanKhau;
	private String DienGiaDinh;
	private String LaHoNgheo;

	public HoDanBean(String maHoDan, String hoTenChuHo, int to, String khoiHoacThon, String soDienThoai,
			String diaChiNha, int soNhanKhau, String dienGiaDinh, String laHoNgheo) {
		super();
		MaHoDan = maHoDan;
		HoTenChuHo = hoTenChuHo;
		To = to;
		KhoiHoacThon = khoiHoacThon;
		SoDienThoai = soDienThoai;
		DiaChiNha = diaChiNha;
		SoNhanKhau = soNhanKhau;
		DienGiaDinh = dienGiaDinh;
		LaHoNgheo = laHoNgheo;
	}

	public String getMaHoDan() {
		return MaHoDan;
	}

	public void setMaHoDan(String maHoDan) {
		MaHoDan = maHoDan;
	}

	public String getHoTenChuHo() {
		return HoTenChuHo;
	}

	public void setHoTenChuHo(String hoTenChuHo) {
		HoTenChuHo = hoTenChuHo;
	}

	public int getTo() {
		return To;
	}

	public void setTo(int to) {
		To = to;
	}

	public String getKhoiHoacThon() {
		return KhoiHoacThon;
	}

	public void setKhoiHoacThon(String khoiHoacThon) {
		KhoiHoacThon = khoiHoacThon;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getDiaChiNha() {
		return DiaChiNha;
	}

	public void setDiaChiNha(String diaChiNha) {
		DiaChiNha = diaChiNha;
	}

	public int getSoNhanKhau() {
		return SoNhanKhau;
	}

	public void setSoNhanKhau(int soNhanKhau) {
		SoNhanKhau = soNhanKhau;
	}

	public String getDienGiaDinh() {
		return DienGiaDinh;
	}

	public void setDienGiaDinh(String dienGiaDinh) {
		DienGiaDinh = dienGiaDinh;
	}

	public String getLaHoNgheo() {
		return LaHoNgheo;
	}

	public void setLaHoNgheo(String laHoNgheo) {
		LaHoNgheo = laHoNgheo;
	}

}
