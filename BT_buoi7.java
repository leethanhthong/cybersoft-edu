package demo_java04;

import java.util.Scanner;

public class BT_buoi7 {

	public static void main(String[] args) {
		// Viết hàm tìm số lớn nhất a, b, c do người dùng nhập vào
//		double a; double b; double c;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập vào số a");
//		a = sc.nextDouble();
//		System.out.println("Nhập vào số b");
//		b = sc.nextDouble();
//		System.out.println("Nhập vào số c");
//		c = sc.nextDouble();
//
//		soLonNhat3So(a, b, c);
//		int n;
//		double a = 0;
//		double b = 0;
//		do {
//			System.out.println("Chọn chương trình tính toán: \n 1: +\n 2: -\n 3: *\n 4: /");
//			n = sc.nextInt();
//			if (n < 1 || n > 4) {
//				System.out.println("Nhập ko hợp lệ");
//			} else {
//				System.out.println("Nhập vào số a");
//				a = sc.nextDouble();
//				System.out.println("Nhập vào số b");
//				b = sc.nextDouble();
//			}
//
//		} while (n < 1 || n > 4);
//
//		chuongTrinh(a, b, n);
		
		
		
		
		//BÀI TẬP VỀ NHÀ BUỔI 7:
		int opt;
		double kmCUS;
		int waittingTime ;
		int chargeTime;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Công cụ tính số tiền cần phải trả khi sử dụng Grab car.");
		
		do {
			System.out.println("Vui lòng ấn chọn (1), (2), (3) các dịch vụ Grab dưới đây:\n 1:Grab CAR\n 2:Grab SUV\n 3:Grab BLACK ");
			opt = sc.nextInt();
			
			if(opt < 1 || opt > 3) {
				System.out.println("Chọn không hợp lệ, vui lòng thử lại");
			}
			
		}while (opt < 1 || opt > 3);
		
		do {
			System.out.println("Nhập vào số km đã đi được");
			kmCUS = sc.nextDouble();
			System.out.println("Nhập vào số thời gian chờ khách, theo đơn vị (phút)");
			waittingTime = sc.nextInt();
			
			if (kmCUS < 0 || waittingTime < 0) {
				System.out.println("Dữ liệu nhập vào không được < 0, vui lòng nhập lại");
			}
		}while(kmCUS < 0 || waittingTime < 0);
		
		sc.close();
		
		chargeTime = waittingTime < 3 ? 0 : waittingTime / 3;
		
		
		switch (opt) {
		case 1:
			System.out.println("Tổng tiền khách phải trả: " + (grabCar(kmCUS) + (chargeTime * 2000)) + " đ");
			break;
		case 2:
			System.out.println("Tổng tiền khách phải trả: " + (grabSuv(kmCUS) + (chargeTime * 3000)) + " đ");
			break;
		case 3:
			System.out.println("Tổng tiền khách phải trả: " + (grabBlack(kmCUS) + (chargeTime * 3500)) + " đ");
			break;

		default:
			break;
		}
			
	}
	public static double grabCar(double kmCus) {
		double grbCar = 0;
		
		if (kmCus > 1 && kmCus < 19) {
			grbCar = 8000 + (7500 * (kmCus - 1 ));
		}else if (kmCus > 19) {
			grbCar = 8000 + (7500 * 18) + (7000 * (kmCus - 19 ));
		}else {
			grbCar = 8000 * kmCus;
		}
		
		return grbCar		;
	}
	public static double grabSuv(double kmCus) {
		double grbSuv = 0;
		
		if (kmCus > 1 && kmCus < 19) {
			grbSuv = 9000 + (8500 * (kmCus - 1 ));
		}else if (kmCus > 19) {
			grbSuv = 9000 + (8500 * 18) + (8000 * (kmCus - 19 ));
		}else {
			grbSuv = 9000 * kmCus;
		}
		
		return grbSuv		;
	}
	public static double grabBlack(double kmCus) {
		double grbBlack = 0;
		
		if (kmCus > 1 && kmCus < 19) {
			grbBlack = 10000 + (9500 * (kmCus - 1 ));
		}else if (kmCus > 19) {
			grbBlack = 10000 + (9500 * 18) + (9000 * (kmCus - 19 ));
		}else {
			grbBlack = 10000 * kmCus;
		}
		
		return grbBlack		;
	}
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void soLonNhat3So(double a, double b, double c) {
//		double max = a;
//		if (a < b)
//			max = b;
//		if (b < c)
//			max = c;
//		System.out.println("Số lớn nhất là: " + max);
//	}
//
//	public static void chuongTrinh(double a, double b, int n) {
//		switch (n) {
//		case 1:
//			System.out.println("Tổng 2 số là: " + (a + b));
//			break;
//		case 2:
//			System.out.println("Hiệu 2 số là: " + (a - b));
//			break;
//		case 3:
//			System.out.println("Tích 2 số là: " + (a * b));
//			break;
//		case 4:
//			if (b == 0)
//				System.out.println("Số b = 0, không thể thực hiện phép chia");
//			else
//				System.out.println("Thương 2 số là: " + (a / b));
//			break;
//
//		default:
//
//			break;
//		}
//	}
}
