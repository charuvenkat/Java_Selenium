package week1.day1;

public class Scase {


	public static void main(String[] args) {
		
int x=5,y=5,s=0; 
String calc ="add";
switch(calc) {

		case "add":
		System.out.println( x+y);
		break;
		case "sub":
		System.out.println(x-y);
		break;
		case "mul":
		System.out.println(x*y);
		break;
		case "div":
		System.out.println(x/y);
		break;
		default:
			System.out.println("No Calculation");
	}
	}
}
