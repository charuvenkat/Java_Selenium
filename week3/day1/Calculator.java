package week3.day1;

public class Calculator {

	
	public void add(int a, int b) {
		System.out.println( a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println( a+b+c);
	}

	public void mul(int a, int b) {
		System.out.println(a*b);
	}

	public void mul(int a, double b) {
		System.out.println(a*b);
	}

	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	public void sub(int a, double b) {
		System.out.println(a-b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}

	public void div(int a, double b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(2,3);
		cal.add(5,5,5);
		cal.mul(5,2);
		cal.mul(2, 2.2);
		cal.sub(5,2);
		cal.sub(6, 2.2);
		cal.div(10,2);
		cal.div(10, 2.2);
		

	}

}
