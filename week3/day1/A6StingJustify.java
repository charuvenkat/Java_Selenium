package week3.day1;

public class A6StingJustify {

	public static void main(String[] args) {
		String str3=new String("Kutty");
		String str4=new String("Kutty");
		
		if(str3==(str4)) {
			System.out.println("same text");
		}
		else
			System.out.println("Diff Text");
		System.out.println("Its is Diff since == operator compares the reference of that string");
		
			if(str3.equals(str4)) {
				System.out.println("same text");
			}
			else
				System.out.println("Diff Text");
			System.out.println("Equals compares the string");
	}

}
