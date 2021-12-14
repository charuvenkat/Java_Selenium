package week3.day1;

public class StringCompare {

	public static void main(String[] args) {
		
		/*Write a Java program to compare a given string to another string, ignoring case considerations.

		String 1="I am Learning Java" 
		String 2="I am learning java?   
		**  Explore with == operator
		**               equals
		**               equalsignorecase  */
		
		
			        String st1 = "I am Learning Java";
			        String st2 = "I am Learning Java";
			        //I am learning java
			        System.out.println("string 1 = " + " " + st1 );
			        System.out.println("string 1 = " + " " + st2 + "\n");
			        
			        // String comparison - Using equalsIgnoreCase
			        boolean cmp = st1.equalsIgnoreCase(st2);
			        System.out.println("String Comparison Using equalIgnoreCase  :" + cmp + "\n");
			        
			        //String comparison - Using  == comparison
			        System.out.println("String comparison Using  == ");
			        if (st1==st2) {
			        System.out.println("Equals \n" );
			        }
			        else
			        System.out.println("Not Equals \n");
			        
			        // String comparison - equals
			        System.out.println("String Comparison Using Equals  :" + st1.equals(st2));
			       
			        
			        // String comparison - contains
			        System.out.println("String Comparison Using contains  :" + st1.contains(st2));
			       
			        
			    }
		
}
