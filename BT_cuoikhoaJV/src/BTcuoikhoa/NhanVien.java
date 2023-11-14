package BTcuoikhoa;

public class NhanVien implements TinhNang {
	protected String maSo;
	protected String hoTen;
	protected String sdt;
	protected int soNgayLamViec;
	
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public void nhapThongTin() {
		nhapMaSo();
		nhapHoTen();
		nhapSDT();
		nhapSoNgayLamViec();
	}
	public String  toString() {
		return "Mã số: " + maSo + " Họ Tên: " + hoTen + "\n" ;
	}
	public void nhapMaSo() {
		System.out.println("Nhập mã số nhân viên: ");
        String maSo = sc.nextLine();
        setMaSo(maSo);
	}
	public void nhapHoTen() {
		System.out.println("Nhập họ tên nhân viên: ");
		String hoten = sc.nextLine();
		while(hoten.isEmpty()) {
			System.out.println("Họ tên không được để trống,  vui lòng nhập lại: ");
			hoten = sc.nextLine();
		}
		setHoTen(hoten);
	}
	public void nhapSDT() {
		System.out.println("Nhập sđt nhân viên: ");
		String sdt = sc.nextLine();
		while(sdt.length() != 10) {
			System.out.println("Số điện thoại không được lớn hơn 10 ký tự, vui lòng nhập lại: ");
			sdt  = sc.nextLine();
		}
		setSdt(sdt);
	}
	public void nhapSoNgayLamViec() {
		System.out.println("Nhập số ngày làm việc của nhân viên trong một tháng: ");
		int ngaylamviec = Integer.parseInt(sc.nextLine());
		while(ngaylamviec > 31 || ngaylamviec < 0) {
			System.out.println("Số ngày làm việc của nhân viên trong một tháng không hợp lệ, vui lòng nhập lại: ");
			ngaylamviec = Integer.parseInt(sc.nextLine());
		}
		setSoNgayLamViec(ngaylamviec);
	}
	public void xuatThongTinNhanVien() {
		
	}
	public double tinhLuong() {
		return 0;
	}
	 public String tenNhanVien() {
	        String[] hoTen = getHoTen().split(" ");
	        return hoTen[hoTen.length-1];
	    }
}
