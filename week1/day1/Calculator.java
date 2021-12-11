package week1.day1;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
		
	}

	public double mul(double m, double n) {
		return m*n;
		
	}
	public int div(int d, int e) {
		return d/e;
		
	}
	public double sub(double s, double t) {
		return s-t;
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(2,3));
		System.out.println(cal.mul(5.2, 2));
		System.out.println(cal.div(10, 2));
		System.out.println(cal.sub(6.2, 3.1));
		
	}

}
