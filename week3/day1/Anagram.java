package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length() == text2.length() ) {
			System.out.println("Strings sizes are equal");
			char[] cht1= text1.toCharArray();
			char[] cht2= text2.toCharArray();
			Arrays.sort(cht1);
			Arrays.sort(cht2);
			System.out.println(cht1);
			System.out.println(cht2);
			boolean flag = Arrays.equals(cht1, cht2);
			System.out.println("The two char arrays are equal? " + flag);
		}
		else
			System.out.println("Strings  are not equal");
	}

}
