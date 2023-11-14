package BTcuoikhoa;

public class GiamDoc extends NhanVien {
	protected float coPhan;
	
	protected double luong1ngay = 300;
	
	public GiamDoc() {}
	
	public GiamDoc (String maSo, String hoTen, String sdt, int soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLamViec = soNgayLamViec;
	}
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		nhapCoPhan();
	}
	public void nhapCoPhan() {
		System.out.println("Nhập số cổ phần của giám đốc mới: ");
		float cophan = Float.parseFloat(sc.nextLine());
		while(cophan < 0 || cophan > 100) {
			System.out.println("Số cổ phần không hợp lệ, vui lòng nhập lại");
			cophan = Float.parseFloat(sc.nextLine());
		}
		this.coPhan = cophan;
	}
	@Override
	public void xuatThongTinNhanVien() {
		 System.out.printf("%-10s | %-20s | %-10s | %-10d | %-10.2f | %-10.2f\n", maSo, hoTen, sdt, soNgayLamViec, luong1ngay, tinhLuong());
	}
	public double tinhLuong() {
		return this.soNgayLamViec * (int) this.luong1ngay;
	}
}
