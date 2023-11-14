package BTcuoikhoa;

public class NhanVienThuong extends NhanVien {
	protected String maSepTruongPhong = null;

	public String getMaSepTruongPhong() {
		return maSepTruongPhong;
	}

	public void setMaSepTruongPhong(String maSepTruongPhong) {
		this.maSepTruongPhong = maSepTruongPhong;
	}

	protected double luong1ngay = 100;

	public NhanVienThuong() {
	}

	public NhanVienThuong(String maSo, String hoTen, String sdt, int soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLamViec = soNgayLamViec;
	}
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
	}
	@Override
	public void xuatThongTinNhanVien() {
		 System.out.printf("%-10s | %-20s | %-10s | %-10d | %-10.2f | %-10.2f\n", maSo, hoTen, sdt, soNgayLamViec, luong1ngay, tinhLuong());
	}
	public double tinhLuong() {
		return this.soNgayLamViec * (int) this.luong1ngay;
	}
}
