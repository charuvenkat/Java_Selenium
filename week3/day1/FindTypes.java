package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//Convert the String to character array
		char[] charr= test.toCharArray();
	
		
		
		//Traverse through each character (using loop)
		for(int i=0; i<test.length();i++) {
			if (Character.isLetter(charr[i])){
					letter++;
			}
			else if(Character.isSpaceChar(charr[i])){
				space ++ ;
			}
			else if(Character.isDigit(charr[i])){
				num ++ ;
			}
			else{
				specialChar ++;
			
			}
			
	}
		System.out.println("$$ Welcome to 2nd Class of Automation $$");
		System.out.println(" Total Number of characters in a string : " + test.length());
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialChar: " + specialChar);
}
}
