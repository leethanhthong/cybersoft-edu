package BTbuoi10;

import java.util.Scanner;

public class Bai3_QLSV {
	private int maSV;
	private String hoTen;
	private float diemLT; private float diemTH;
	
	public Bai3_QLSV() {
		this.maSV = 0;
		this.hoTen = "";
		this.diemLT = 0;
		this.diemTH = 0;
	}
	public Bai3_QLSV(int maSV, String hoTen, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập mã sinh viên");
			setMaSV(sc.nextInt());
			sc.nextLine();
			System.out.println("Nhập họ tên sinh viên");
			setHoTen(sc.nextLine());
			System.out.println("Nhập điểm lý thuyết");
			setDiemLT(sc.nextFloat());
			System.out.println("Nhập điểm thực hành");
			setDiemTH(sc.nextFloat());
			if(maSV < 0 || diemLT < 0 || diemLT > 10 || diemTH < 0 || diemTH > 10) {
				System.out.println("Số liệu nhập vào không hợp lệ, vui lòng nhập lại.");
			}
		}while(maSV < 0 || diemLT < 0 || diemLT > 10 || diemTH < 0 || diemTH > 10);
		
	}
	public double diemTB() {
		return (diemLT + diemTH) / 2;
	}
	public String toString() {
		return "Sinh viên " + hoTen + ", mã số " + maSV + " có điểm trung bình là: " + diemTB();
	}
}
