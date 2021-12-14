package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
			String str = "PayPal India";
			
			System.out.println("String Lenght  :" + str.length());
			Set<Character> chset = new LinkedHashSet<Character>();
			
			for(int i=0; i<str.length(); i++)
			{
			chset.add(str.charAt(i));
			}
			System.out.println("Duplcate Removed from the String - PayPal India  :" + chset);
			

	}

}
