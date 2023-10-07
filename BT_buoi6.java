package demo_java04;

import java.util.Scanner;

public class BT_buoi6 {

	public static void main(String[] args) {
		// Bài 1:
		Scanner sc = new Scanner(System.in);
		int player1;
		String playerr1 = "";
		int random1;
		String randomm1 = "";
		int scoreCpt = 0;
		int scorePlayer = 0;

		do {
			random1 = (int) (Math.random() * 3 + 1);
			// 1: Búa, 2: Kéo, 3: Bao
			System.out.println("Trò chơi oẳn tù tì: \n 0: Dừng trò chơi \n 1: Búa \n 2: Kéo \n 3: Bao");
			player1 = sc.nextInt();

			switch (random1) {
			case 1:
				randomm1 = "Búa ";
				break;
			case 2:
				randomm1 = "Kéo ";
				break;
			case 3:
				randomm1 = "Bao ";
				break;
			}
			switch (player1) {
			case 1:
				playerr1 = "Búa";
				break;
			case 2:
				playerr1 = "Kéo";
				break;
			case 3:
				playerr1 = "Bao";
				break;
			}
			if (random1 == player1) {
				System.out.println("Bạn và máy hòa nhau " + "(" + randomm1 + ")\n");
			} else if (random1 == 1 && player1 == 2 || random1 == 2 && player1 == 3 || random1 == 3 && player1 == 1) {
				System.out.println("Máy: " + randomm1 + "\nBạn: " + playerr1 + "\nBạn thua\n");
				scoreCpt++;
			} else if (random1 == 1 && player1 == 3 || random1 == 2 && player1 == 1 || random1 == 3 && player1 == 2) {
				System.out.println("Máy: " + randomm1 + "\nBạn: " + playerr1 + "\nBạn thắng\n");
				scorePlayer++;
			} else if (player1 < 0 || player1 > 3) {
				System.out.println("Chọn không hợp lệ\n");
			}
		} while (player1 != 0);

		if (scoreCpt > scorePlayer) {
			System.out.println("Máy thắng nhiều hơn, tỷ số: " + scoreCpt + ":" + scorePlayer);
		} else if (scoreCpt < scorePlayer) {
			System.out.println("Bạn thắng nhiều hơn, tỷ số: " + scoreCpt + ":" + scorePlayer);
		} else {
			System.out.println("Bạn và máy hòa nhau, tỷ số: " + scoreCpt + ":" + scorePlayer);
		}
		System.out.println("");

		// Bài 2:
		int tong2 = 0;
		int i2 = 1;
		while (tong2 <= 10000) {
			tong2 += i2;
			i2++;
		}
		;
		System.out.println("Số nguyên dương n nhỏ nhất là: " + i2 + "\n");

		// Bài 3:
		System.out.println("Tính tổng các số lẻ nguyên dương < n, n nhập từ bàn phím:");
		int n3;
		int tong3 = 0;
		do {
			System.out.println("Nhập số nguyên dương n > 0");
			n3 = sc.nextInt();
		} while (n3 < 0);

		for (int i = 1; i < n3; i++) {
			if (i % 2 != 0) {
				tong3 += i;
			}
		}
		System.out.println(tong3);

		// Bài 4:
		System.out.println("Tính tổng S(n) = x + x^2 + x^3 + ... + x^n. n và x nhập từ bàn phím.");
		double tong4 = 0;
		System.out.println("Nhập x: ");
		float x4 = sc.nextFloat();
		System.out.println("Nhập n: ");
		int n4 = sc.nextInt();

		for (int i = 1; i <= n4; i++) {
			tong4 += canBac(x4, i);
		}
		System.out.println(tong4);

		// Bài 5:
		double tienGui5;
		double tienLai5 = 0;
		double tienFuture5;
		double month5 = 0;
		do {
			System.out.println(
					"Ngân hàng WAITINGBANK đang có lãi suất gửi tiết kiệm là 19%/năm. Nhập vào số tiền quý khách muốn gửi:");
			tienGui5 = sc.nextDouble();
			System.out.println("Nhập vào số tiền quý khách muốn nhận được trong tương lai:");
			tienFuture5 = sc.nextDouble();
			if (tienGui5 < 0 || tienFuture5 < 0) {
				System.out.println("Số tiền nhập vào không hợp lệ.");
			}
		} while (tienGui5 < 0 || tienFuture5 < 0);

		while (tienGui5 + tienLai5 < tienFuture5) {
			tienLai5 += tienGui5 * (0.19/12);
			month5++;
		}
		System.out.println("Số năm chờ đợi tiền gốc + lãi kỳ vong: " + (int)month5/12 +" năm " + month5%12 + " tháng");

	}

	static double canBac(double x, int n) {
		double result = 0;
		result = Math.pow(x, n);
		return result;
	}
}
