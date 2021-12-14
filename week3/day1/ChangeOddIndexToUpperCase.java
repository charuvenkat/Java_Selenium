package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		StringBuffer updatedString = new StringBuffer(); 
		char[] chst= test.toCharArray();
		System.out.println(chst);
		for (int i = 0; i < chst.length; i++) { 
		      // get current character 
		      char c = chst[i]; 
		      		// check if position of this character is odd 
		      		if (i % 2 != 0) { 
		      		// convert it to upper case 
		    	 
		      		c = Character.toUpperCase(c); 
		      		} 
		      		// append character to string buffer 
		      		updatedString.append(c); 
		    } 
		    System.out.println("Modified string is: " + updatedString.toString()); 
		  } 
		}
		
	


