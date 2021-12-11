package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/*String str;
		Scanner sc = new Scanner(System.in);
		 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();*/
	 
		String str="madam";
		int len= str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
			
		}
			
		if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}
}