package demo_java04;

import java.util.Scanner;

public class BT_buoi8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String opt = "";

		do {
			System.out.println("Vui lòng nhập số phần tử của mảng");
			n = Integer.parseInt(sc.nextLine());
			
			if(n < 0) {
				System.out.println("Số phần tử của mảng phải > 0, vui lòng nhập lại.");
			}
		} while (n < 0);
		int[] mangso = new int[n];

		nhapMang(mangso);
		
		boolean ktOpt = true;

		do {
		System.out.println("Mời bạn chọn thực hiện một chức năng bên dưới:\n"
				+ "B. Tổng các số dương.\n"
				+ "C. Tổng các số lẻ.\n"
				+ "D. Đếm có bao nhiêu số dương.\n"
				+ "E. Tìm số nhỏ nhất trong mảng.\n"
				+ "F. Tìm số dương nhỏ nhất trong mảng.\n"
				+ "G. Tìm số chẵn cuối cùng trong mảng, nếu không có giá trị chẵn thì trả về -1.\n"
				+ "H. VIẾT HÀM tìm số chẵn đầu tiền trong mảng, nếu không có giá trị chẵn thì trả về -1.\n"
				+ "I. Tìm số NGUYÊN TỐ đầu tiên trong mảng, nếu mảng không có số nguyên thì trả về -1.\n"
				+ "J. Tìm số dương cuối cùng trong mảng, nếu không có giá trị dương thì trả về -1.\n"
				+ "K. Tìm số chẵn nhỏ nhất trong mảng, nếu không có giá trị chẵn thì trả về -1.");
		
		opt = sc.nextLine().toUpperCase();
		
		if(opt.equals("B") || opt.equals("C") || opt.equals("D") || opt.equals("E") || opt.equals("F") || opt.equals("G") || opt.equals("H") || opt.equals("J") || opt.equals("K")) {			
			ktOpt = false;
		}else {
			System.out.println("Chọn không hợp lệ, vui lòng chọn lại.\n");
		}
		}while( ktOpt == true);

		// Lọc ra mảng số dương:
		int[] mangSoDuong = new int[mangso.length];
		int sl_duong = 0;

		for (int i = 0; i < mangSoDuong.length; i++) {
			if (mangso[i] > 0) {
				mangSoDuong[sl_duong] = mangso[i];
				sl_duong++;
			}
		}
		// Lọc ra mảng số âm:
		int[] mangSoAm = new int[mangso.length];
		int sl_am = 0;

		for (int i = 0; i < mangSoAm.length; i++) {
			if (mangso[i] < 0) {
				mangSoAm[sl_am] = mangso[i];
				sl_am++;
			}
		}

		// Xử lí menu lựa chọn:

		switch (opt) {
		case "B":
			tongCacSoDuong(mangSoDuong);
			break;
		case "C":
			tongCacSoLe(mangso);
			break;
		case "D":
			System.out.println("Có " + sl_duong + " số dương trong mảng.");
			break;
		case "E":
			int soNhoNhat = 0;

			// TH1: Mảng chỉ có số dương => Xử lí mangSoDuong
			// TH2: Mảng có số âm và số dương hoặc chỉ có số âm => Xử lí mangSoAm

			// TH1:
			if (mangSoAm[0] == 0) {
				soNhoNhat = mangSoDuong[0];
				for (int i = 1; i < mangSoDuong.length; i++) {
					if (mangSoDuong[i] < soNhoNhat) {
						soNhoNhat = mangSoDuong[i];
					}
				}
			} // TH2:
			else if (mangSoAm[0] != 0) {
				soNhoNhat = mangSoAm[0];
				for (int i = 1; i < mangSoAm.length; i++) {
					if (mangSoAm[i] < soNhoNhat) {
						soNhoNhat = mangSoAm[i];
					}
				}
			}
			System.out.println("Số nhỏ nhất trong mảng là: " + soNhoNhat);
			break;
		case "F":
			int soDuongNhoNhat = mangSoDuong[0];
			for (int i = 1; i < (mangSoDuong.length - sl_am); i++) {
				if (mangSoDuong[i] < soDuongNhoNhat) {
					soDuongNhoNhat = mangSoDuong[i];
				}
			}
			System.out.println("Số dương nhỏ nhất là: " + soDuongNhoNhat);

			break;
		case "G":
			soChanCuoiCung(mangso);
			break;
		case "H":
			System.out.println("	Public static void soChanDauTien(int[] mang){\n"
					+ "			int soChanDauTien = -1;\n" + "			\n"
					+ "			for (int i = 0; i < mang.length ; i++) {\n" + "				if(mang[i] % 2 == 0) {\n"
					+ "					soChanDauTien = mang[i];\n" + "					break;\n" + "				}\n"
					+ "			}\n" + "			if(soChanDauTien == -1) {\n"
					+ "				System.out.println(\"Trong mảng không có số chẵn, kết quả trả về: -1 \" );\n"
					+ "			}else {\n"
					+ "				System.out.println(\"Số chẵn đầu tiên trong mảng là: \" + soChanDauTien);\n"
					+ "			}\n" + "		}");
			break;
		case "I":
			int soNguyenToDauTien = -1;
			
			for (int i = 0; i < mangso.length; i++) {
				boolean ktsnt = ktSoNguyenTo(mangso[i]) ;
				if( ktsnt == true) {
					soNguyenToDauTien = mangso[i];
					break;
				}
			}
			if (soNguyenToDauTien == -1 ) {
				System.out.println("Mảng không có số nguyên tố, kết quả trả về: -1");
			}else {
				System.out.println("Số nguyên tố đầu tiên là: "+soNguyenToDauTien);
			}			
			break;
		case "J":
			int soDuongCuoiCung = -1;
			
			for (int i = mangSoDuong.length -1 ; i >= 0 ; i--) {
				if(mangSoDuong[i] > 0) {
					soDuongCuoiCung = mangSoDuong[i];
					break;
				}
			}
			if(soDuongCuoiCung == -1) {
				System.out.println("Mảng không có số dương, kết quả trả về: -1");
			}else {
				System.out.println("Số dương cuối cùng trong mảng là: " + soDuongCuoiCung);
			}
			
			break;
		case "K":
			int soChanNhoNhat = -1;
			
			for (int i = 0; i < mangso.length; i++) {
				if(mangso[i] % 2 == 0) {
					if (mangso[i] < soChanNhoNhat) {
						soChanNhoNhat = mangso[i];
					}
				}
			}
			if (soChanNhoNhat == -1) {
				System.out.println("Không có số chẵn trong mảng, kết quả trả về: -1");
			}else {
				System.out.println("Số chẵn nhỏ nhất là: " + soChanNhoNhat);
			}
			break;
		default:
			break;
		}
	}

	public static void nhapMang(int[] mang) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Vui lòng nhập giá trị cho phần tử số " + i);
			mang[i] = sc.nextInt();
		}
	}


	public static void tongCacSoDuong(int[] mang) {
		int tong = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 0) {
				tong += mang[i];
			}
		}
		System.out.println("Tổng các số dương: " + tong);
	}

	public static void tongCacSoLe(int[] mang) {
		int tong = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] % 2 != 0) {
				tong += mang[i];
			}
		}
		System.out.println("Tổng các số lẻ: " + tong);
	}
	public static int soChanCuoiCung(int[] mang) {
		int soChanCuoiCung =  -1;

		for (int i = mang.length - 1; i >= 0; i--) {
			if (mang[i] % 2 == 0) {
				soChanCuoiCung = mang[i];
				break;
			}
		}
		if (soChanCuoiCung == -1) {
			System.out.println("Trong mảng không có số chẵn, kết quả trả về: -1 ");
		} else {
			System.out.println("Số chẵn cuối cùng trong mảng là: " + soChanCuoiCung);
		}
		return soChanCuoiCung;
	}
	public static boolean ktSoNguyenTo(int snt) {
		if (snt <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(snt); i++) {
	           if (snt % i == 0) {
	               return false;
	           }
	       }
		
		return true;
	}

}