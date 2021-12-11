package week1.day1;

public class Armsstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123, s=0;
		while(n>0) {
			int rem=n%10;
			s=s+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(s);
	}

}
