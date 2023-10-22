package BTbuoi10;

import java.util.Scanner;

public class Bai1_ptbac2 {
	private double a; private double b; private double c;
	
	public Bai1_ptbac2 (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Bai1_ptbac2 () {		
	}
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public void nhaptt_bai1() {
		System.out.println("Giải phương trình bậc 2, ax2 + bx + c = 0\nMời bạn nhập vào 3 số a, b, c");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a:");
		setA(sc.nextDouble());
		System.out.println("Nhập vào số b:");
		setB(sc.nextDouble());
		System.out.println("Nhập vào số c:");
		setC(sc.nextDouble());
	}
	public double delta_bai1() {
		double delta;
		double a = getA();
		double b = getB();
		double c = getC();
		
		delta = b * b - 4 * a * c;
		return delta;
	}
	public void nghiemPT_bai1() {
		double delta = delta_bai1();
		double a = getA();
		double b = getB();
		double c = getC();
		double x1; double x2;
		if (a == 0) {
		    if (b == 0) {
			if (c == 0) {
			    System.out.println("Phương trình vô số nghiệm!");
			} else {
			    System.out.println("Phương trình vô nghiệm!");
			}
		    } else {
			System.out.println("Phương trình có nghiệm là: " + (-c / b));
		    }
		} else { // Trường hợp a != 0
		    // Tính giá trị delta
		    delta = b * b - 4 * a * c;
		    if (delta < 0) {
			System.out.println("Phương trình vô nghiệm!");
		    } else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: " + x1);
		    } else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm phân biệt là:\nx1 = " + x1 + "\nx2 = " + x2);
		    }
		}
	}
	
	
	
	
	
	
	
	
	
	
}

