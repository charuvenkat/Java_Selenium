package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetRemoveCharDuplicates {

	public static void main(String[] args) {
			String str = "PayPal India";
			char[] charArr= str.toCharArray();
			
			
			System.out.println("String Length  :" + str.length());
			Set<Character> chset = new LinkedHashSet<Character>();
			
			for(char ch: charArr) {
				chset.add(ch);
			}
			System.out.println("Duplcate Removed from the String - PayPal India  :" + chset);
			
			//Another way
			
		/*	for(int i=0; i<str.length(); i++)
			{
			chset.add(str.charAt(i));
			}
			System.out.println("Duplcate Removed from the String - PayPal India  :" + chset);*/
			

	}
	
}
