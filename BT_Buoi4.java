package demo_java04;

import java.util.Scanner;

public class BT_Buoi4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String kqBai1 = "";
//		
//		System.out.println("Nhập vào số nguyên m: ");
//		int m = sc.nextInt();
//		System.out.println("Nhập vào số nguyên n: ");
//		int n = sc.nextInt();
//		
//		if (m == n) {
//			System.out.println("Số m và n bằng nhau");
//		}else {
//			kqBai1 = m > n ? "Số nguyên lớn nhất là m" : "Số nguyên lớn nhất là n";
//			System.out.println(kqBai1);
//		}

		// Bài 5(trên lớp):
//		System.out.println("Ai đang sử dụng máy này, Bố(B), Mẹ(H), Anh trai(A), Em gái(E)");
//		String user = sc.nextLine();
//
//		//toUpperCase(): Biến toàn bộ chữ thành chữ hoa
//		//toLowerCase(): Biến toàn bộ chữ thành chữ thường
//		switch (user.toUpperCase()) {
//		case "B":
//		case "b":
//			System.out.println("Máy tính chào Bố");
//			break;
//		case "H":
//		case "h":
//			System.out.println("Máy tính chào Mẹ");
//			break;
//		case "A":
//		case "a":
//			System.out.println("Máy tính chào Anh trai");
//			break;
//		case "E":
//		case "e":
//			System.out.println("Máy tính chào Em gái");
//			break;
//
//		default:
//			System.out.println("Nhập vào không hợp lệ");
//			break;
//		}

		/** Bài tập về nhà */

		// Bài tập 1:
		Scanner scc = new Scanner(System.in);

		System.out.println("Vui lòng nhập tên của sinh viên thứ nhất: ");
		String tenSV1 = scc.nextLine();
		System.out.println("Vui lòng nhập năm sinh của sinh viên thứ nhất: ");
		int nsSV1 = Integer.parseInt(scc.nextLine());

		System.out.println("Vui lòng nhập tên của sinh viên thứ hai: ");
		String tenSV2 = scc.nextLine();
		System.out.println("Vui lòng nhập năm sinh của sinh viên thứ hai: ");
		int nsSV2 = Integer.parseInt(scc.nextLine());

		System.out.println("Vui lòng nhập tên của sinh viên thứ ba: ");
		String tenSV3 = scc.nextLine();
		System.out.println("Vui lòng nhập năm sinh của sinh viên thứ ba: ");
		int nsSV3 = Integer.parseInt(scc.nextLine());

		if (nsSV1 > nsSV2 && nsSV1 > nsSV3) {
			System.out.println(tenSV1 + " sinh năm" + nsSV1 + " là sinh viên trẻ tuổi nhất \n");
		} else if (nsSV2 > nsSV1 && nsSV2 > nsSV3) {
			System.out.println(tenSV2 + " sinh năm" + nsSV2 + " là sinh viên trẻ tuổi nhất \n");
		} else if (nsSV3 > nsSV1 && nsSV3 > nsSV2) {
			System.out.println(tenSV3 + " sinh năm" + nsSV3 + " là sinh viên trẻ tuổi nhất \n");
		} else if (nsSV1 == nsSV2 && nsSV1 > nsSV3) {
			System.out.println(tenSV1 + " và" + tenSV2 + " sinh năm" + nsSV1 + " là 2 sinh viên trẻ tuổi nhất \n");
		} else if (nsSV1 == nsSV3 && nsSV1 > nsSV2) {
			System.out.println(tenSV1 + " và" + tenSV3 + " sinh năm" + nsSV1 + " là 2 sinh viên trẻ tuổi nhất \n");
		} else if (nsSV2 == nsSV3 && nsSV2 > nsSV1) {
			System.out.println(tenSV2 + " và" + tenSV3 + " sinh năm" + nsSV2 + " là 2 sinh viên trẻ tuổi nhất \n");
		} else {
			System.out.println(tenSV1 + ", " + tenSV2 + ", " + tenSV3 + " sinh năm " + nsSV1 + " và bằng tuổi nhau \n");
		}
//		
//		
//		//Bài tập 2:
		int soChan = 0;
		int soLe = 0;
		String thongBao = "";

		System.out.println("Vui lòng nhập vào số nguyên thứ nhất: ");
		int soInt1 = Integer.parseInt(scc.nextLine());
		System.out.println("Vui lòng nhập vào số nguyên thứ hai: ");
		int soInt2 = Integer.parseInt(scc.nextLine());
		System.out.println("Vui lòng nhập vào số nguyên thứ ba: ");
		int soInt3 = Integer.parseInt(scc.nextLine());

		thongBao = soInt1 % 2 == 0 ? "Có " + ++soChan + " số chẵn" + " và " + soLe + " số lẻ"
				: "Có " + soChan + " số chẵn" + " và " + ++soLe + " số lẻ";

		thongBao = soInt2 % 2 == 0 ? "Có " + ++soChan + " số chẵn" + " và " + soLe + " số lẻ"
				: "Có " + soChan + " số chẵn" + " và " + ++soLe + " số lẻ";

		thongBao = soInt3 % 2 == 0 ? "Có " + ++soChan + " số chẵn" + " và " + soLe + " số lẻ"
				: "Có " + soChan + " số chẵn" + " và " + ++soLe + " số lẻ";

		System.out.println(thongBao + "\n");
//		
//		
//		//Bài tập 3:
//		
		String ten1, ten2, ten3, gioitinh2, gioitinh3, gioitinh1 = "";
		int namsinh1, namsinh2, namsinh3;
		String ktGT = "nam";

		System.out.println("Vui lòng nhập tên cán bộ 1");
		ten1 = scc.nextLine();
		System.out.println("Vui lòng nhập giới tính cán bộ 1");
		gioitinh1 = scc.nextLine().toLowerCase();
		System.out.println("Vui lòng nhập năm sinh cán bộ 1");
		namsinh1 = Integer.parseInt(scc.nextLine());

		System.out.println("Vui lòng nhập tên cán bộ 2");
		ten2 = scc.nextLine();
		System.out.println("Vui lòng nhập giới tính cán bộ 2");
		gioitinh2 = scc.nextLine().toLowerCase();
		System.out.println("Vui lòng nhập năm sinh cán bộ 2");
		namsinh2 = Integer.parseInt(scc.nextLine());

		System.out.println("Vui lòng nhập tên cán bộ 3");
		ten3 = scc.nextLine();
		System.out.println("Vui lòng nhập giới tính cán bộ 3");
		gioitinh3 = scc.nextLine().toLowerCase();
		System.out.println("Vui lòng nhập năm sinh cán bộ 3");
		namsinh3 = Integer.parseInt(scc.nextLine());

		if (gioitinh1.equals(ktGT) && namsinh1 > namsinh2 && namsinh1 > namsinh3) {
			System.out.println(ten1 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh2.equals(ktGT) && namsinh2 > namsinh1 && namsinh2 > namsinh3) {
			System.out.println(ten2 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh3.equals(ktGT) && namsinh3 > namsinh2 && namsinh3 > namsinh1) {
			System.out.println(ten3 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh1.equals(ktGT) && gioitinh2.equals(ktGT) && namsinh1 == namsinh2 && namsinh1 >= namsinh3) {
			System.out.println(ten1 + " và " + ten2 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh1.equals(ktGT) && gioitinh3.equals(ktGT) && namsinh1 == namsinh3 && namsinh1 >= namsinh2) {
			System.out.println(ten1 + " và " + ten3 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh2.equals(ktGT) && gioitinh3.equals(ktGT) && namsinh2 == namsinh3 && namsinh2 >= namsinh1) {
			System.out.println(ten2 + " và " + ten3 + " là cán bộ nam trẻ nhất \n");
		} else if (gioitinh1.equals(ktGT) && gioitinh2.equals(ktGT) && gioitinh3.equals(ktGT) && namsinh1 == namsinh2
				&& namsinh1 == namsinh3) {
			System.out.println(ten1 + ", " + ten2 + " và " + ten3 + " là cán bộ nam trẻ nhất \n");
		} else {
			System.out.println("Không tìm thấy cán bộ nam \n");
		}
//		
//		
//		//Bài tập 4:
//		
//		//Tọa độ Cybersoft (2 bis, Nguyễn Thị Minh Khai, q 1): 10.790426528204407, 106.7044366438174
		double latCyber = 10.790426528204407;
		double longCyber = 106.7044366438174;
//		
//		//Tọa độ nhà của 3 sinh viên: 
		double latSV1 = 10.77973966877115;
		double longSV1 = 106.68223380721726;
		String tenSv1 = "Thông1";

		double latSV2 = 10.81301369271333;
		double longSV2 = 106.68409221020623;
		String tenSv2 = "Thông2";

		double latSV3 = 10.798133968039869;
		double longSV3 = 106.70698981468689;
		String tenSv3 = "Thông3";
//		
//		//Tính quãng đường từ nhà sv đến Cybersoft:
		double sv1toCyber = Math.sqrt(Math.pow((latCyber - latSV1), 2) + Math.pow((longCyber - longSV1), 2));
		double sv2toCyber = Math.sqrt(Math.pow((latCyber - latSV2), 2) + Math.pow((longCyber - longSV2), 2));
		double sv3toCyber = Math.sqrt(Math.pow((latCyber - latSV3), 2) + Math.pow((longCyber - longSV3), 2));

		if (sv1toCyber > sv2toCyber && sv1toCyber > sv3toCyber) {
			System.out.println(tenSv1 + " là sinh viên nhà xa trường nhất \n");
		} else if (sv2toCyber > sv1toCyber && sv2toCyber > sv3toCyber) {
			System.out.println(tenSv2 + " là sinh viên nhà xa trường nhất \n");
		} else {
			System.out.println(tenSv3 + " là sinh viên nhà xa trường nhất \n");
		}

		// Bài tập thêm:
		double tongTien = 0;

		System.out.println("Vui lòng nhập vào tên sản phẩm: ");
		String tenSP = scc.nextLine();
		System.out.println("Vui lòng nhập vào số lượng mua: ");
		int slg = Integer.parseInt(scc.nextLine());
		System.out.println("Vui lòng nhập vào đơn giá mua (vnđ): ");
		double donGia = scc.nextDouble();

		int ktSlg = slg / 50;

		if (slg < 0 || donGia < 0) {
			System.out.println("Số liệu nhập vào < 0");
		} else {
			switch (ktSlg) {
			case 0:
				tongTien = slg * donGia;
				break;
			case 1:
				tongTien = (50 * donGia) + ((slg - 50) * (donGia - (donGia / 100 * 8)));
				break;

			default:
				tongTien = (50 * donGia) + (50 * (donGia - (donGia / 100 * 8)))
						+ ((slg - 100) * (donGia - (donGia / 100 * 12)));
				break;
			}
//			
			System.out.println("Tổng số tiền phải trả khi mua " + slg + " " + tenSP + " là: " + tongTien);
		}

	}

}
