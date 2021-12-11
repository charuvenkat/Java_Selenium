package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=1234;
		int mod;
		int tot=0;
		
while (input>0) {
	mod=input%10;
	tot=tot+mod;
	input=input/10;
	
}
System.out.println("Sum of digits = "+tot);

	}

}
