package demo_java04;

import java.util.Scanner;

public class BT_buoi3 {
	public static void main(String[] args) {
		//Bài 1:
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị cạnh góc vuông 1: ");
		int gv1 = sc.nextInt();
		System.out.println("Nhập giá trị cạnh góc vuông 2: ");
		int gv2 = sc.nextInt();
		
		double kqbai1 = Math.sqrt(gv1*gv1 + gv2*gv2);
		System.out.println("Chiều dài cạnh huyền là: " + kqbai1 + "\n");	
		
		//Bài 2:
//		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị số thực a: ");
		double a_bai2 = sc.nextDouble();
		System.out.println("Nhập giá trị số nguyên không âm n: ");
		int n = sc.nextInt();
		
		double kqbai2 = a_bai2 * Math.pow((8), n);
		
		System.out.println("Giá trị đơn thức P(x) = ax^n là: " + kqbai2 + "\n");
		
		//Bài 3:
//		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên dương n có 2 ký số: ");
		int n_bai3 = sc.nextInt();
			
		int kq = (n_bai3 % 10) + (n_bai3 / 10);
		System.out.println("Tổng 2 ký số của n là: " + kq + "\n");
		
		//Bài 4:
		final String thongBao = "Giá trị trung bình của 5 số vừa nhập là: ";
		final double average, a, b, c, d, e;
		double sum = 0;
		int count = 0; 
		
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào giá trị số thứ nhất: ");
		a = sc.nextDouble();
		sum += a;
		count++;
		System.out.println("Nhập vào giá trị số thứ hai: ");
		b = sc.nextDouble();
		sum += b;
		count++;
		System.out.println("Nhập vào giá trị số thứ ba: ");
		c = sc.nextDouble();
		sum += c;
		count++;
		System.out.println("Nhập vào giá trị số thứ bốn: ");
		d = sc.nextDouble();
		sum += d;
		count++;
		System.out.println("Nhập vào giá trị số thứ năm: ");
		e = sc.nextDouble();
		sum += e;
		count++;
		
		average = sum/count;
		
		System.out.println(thongBao + average + "\n");
		
		
		//Bài 5:
		float doC, doF;
//		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào độ C ");
		doC = sc.nextFloat();
		
		doF = (float) ((doC * 1.8) + 32);
		
		System.out.println("Độ F là: " + doF + "\n" );
		
		
		//Bài 6:
		final double vnd_usd = 23500;
		double usd_VL;
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số tiền usd");
		usd_VL = sc.nextDouble();
		
		System.out.println("Số tiền vnđ tương ứng là: " + (usd_VL * vnd_usd));
		
		
		
		
		
		
		
		
		
		
	}
}
