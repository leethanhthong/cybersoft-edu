package BTcuoikhoa;

import java.util.ArrayList;

public class TruongPhong extends NhanVien {
	protected int nhanVienCapDuoi = 0;
	protected ArrayList<NhanVien> listCapDuoi = new ArrayList<NhanVien>();
	protected double luong1ngay = 200;

	public TruongPhong() {
	}

	public TruongPhong(String maSo, String hoTen, String sdt, int soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLamViec = soNgayLamViec;
	}

	public void tiepNhanNhanVien(NhanVienThuong nv) {
		listCapDuoi.add(nv);
		nhanVienCapDuoi = listCapDuoi.size();
	}
	public void loaiBoNhanVien(NhanVienThuong nv) {
		listCapDuoi.remove(nv);
		nhanVienCapDuoi = listCapDuoi.size();
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
		return (this.soNgayLamViec * this.luong1ngay) + (100 * this.nhanVienCapDuoi);
	}
}
