package BTbuoi10;

import java.util.ArrayList;

public class Bai4_Account implements TinhNang {
	protected long stk;
	private String tentk;
	protected double tientrongTK;
	
	private final double laiSuat = 0.035;
	
	public Bai4_Account(String tentk, long stk) {
		this.stk = stk;
		this.tentk = tentk.toUpperCase();
		this.tientrongTK = 50;
	}
	public Bai4_Account() {
		
	}
	public Bai4_Account(long stk, String tentk, double tientrongTk) {
		this.stk = stk;
		this.tentk = tentk.toUpperCase();
		this.tientrongTK = tientrongTk;
	}
	public long getStk() {
		return stk;
	}
	public void setStk(long stk) {
		this.stk = stk;
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk.toUpperCase();
	}
	public double getTientrongTK() {
		return tientrongTK;
	}
	public void setTientrongTK(double tientrongTK) {
		this.tientrongTK = tientrongTK;
	}
	@Override
	public String dinhDangTienTe(double soTienTrongTK) {
		return currencyVN.format(soTienTrongTK);
	}
	public String toString() {
		return "Tên chủ tài khoản: " + tentk + "\nSố tài khoản: " + stk + "\nSố dư hiện có: " + dinhDangTienTe(tientrongTK)  ;
	}
	@Override
	public void napTien() {
		double tienGui;	
		do {
			System.out.println("Nhập vào số tiền khách muốn gửi: ");
			tienGui = sc.nextDouble();
			if(tienGui < 50000) {
				System.out.println("Vui lòng nhập số tiền lớn hơn 50.000 đồng.");
			}
		} while (tienGui < 50000);
		this.tientrongTK += tienGui;
	}

	public void rutTien() {
		double tienRut;
		do {
			System.out.println("Vui lòng nhập vào số tiền khách muốn rút, phí rút là 999 đ: ");
			tienRut=sc.nextDouble();
			if(tienRut > tientrongTK - 1049) {
				System.out.println("Số dư tối thiểu còn lại của tài khoản phải trên 50 đ, vui lòng nhập lại số tiền muốn rút");
			}
		} while (tienRut > tientrongTK - 1049);
		tientrongTK -= (tienRut + 999);
	}
	public void daoHan() {
		tientrongTK = tientrongTK + (tientrongTK * laiSuat);
	}
	public double chuyenKhoan(ArrayList<Long> listKH, double tienngnhan) {
		long stkngnhan;
		boolean ktStk = false;
		double tienChuyen;
		do {
			System.out.println("Nhập vào stk người nhận");
			stkngnhan = sc.nextLong();
			for (int i = 0; i < listKH.size(); i++) {
				if(stkngnhan == Long.valueOf(listKH.get(i))) {
					ktStk = true;
					break;
				}
			}
			if(ktStk == false) {
				System.out.println("Không tìm thấy stk người nhận, vui lòng nhập lại");
			}
		}while(ktStk == false);
		do {
			System.out.println("Nhập vào số tiền cần chuyển: ");
			tienChuyen = sc.nextDouble();
			if(tienChuyen > (tientrongTK - 50)) {
				System.out.println("Số dư tối thiểu còn lại của tài khoản phải trên 50 đ, vui lòng nhập lại số tiền muốn chuyển");
			}
		} while (tienChuyen > (tientrongTK - 50));
		tientrongTK -= tienChuyen;
		return tienngnhan += tienChuyen;
		
	}
}
