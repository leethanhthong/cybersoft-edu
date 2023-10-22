package BTbuoi10;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
				
		Bai1_ptbac2 bai1 = new Bai1_ptbac2();
		
		bai1.nhaptt_bai1();
		bai1.nghiemPT_bai1();
		
		
		
		
		Bai3_QLSV sv1 = new Bai3_QLSV();
		sv1.setHoTen("Lê Thành Thông");
		sv1.setMaSV(199);
		sv1.setDiemLT(9);
		sv1.setDiemTH(8);
		
		Bai3_QLSV sv2 = new Bai3_QLSV();
		sv2.setHoTen("Thông Thành Lê");
		sv2.setMaSV(911);
		sv2.setDiemLT(1);
		sv2.setDiemTH(2);
		
		Bai3_QLSV sv3 = new Bai3_QLSV();
		sv3.nhapThongTin();
		
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		
		
		
		ArrayList<Long> listKH = new ArrayList<Long>();
		
		Bai4_Account khach1 = new Bai4_Account();
		khach1.setTentk("Lê Thành Thông");
		khach1.setStk(602214000);
		khach1.setTientrongTK(500000);
		listKH.add(Long.valueOf(khach1.getStk()));
		
		Bai4_Account khach2 = new Bai4_Account("Thông Thành Lê", 214000602);		
		listKH.add(Long.valueOf(khach2.getStk()));
		
		System.out.println(khach1);
		System.out.println(khach2 + "\n");
		
		//Chuyển tiền sang tài khoản khác:
		double tienngnhan = khach1.chuyenKhoan(listKH, khach2.tientrongTK);
		khach2.setTientrongTK(tienngnhan);
		System.out.println(khach1);
		System.out.println(khach2 + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
