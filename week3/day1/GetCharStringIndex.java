package week3.day1;

public class GetCharStringIndex {

	public static void main(String[] args) {
		
		/*1. Write a Java program to get the character 
		 	at the given index within the String. 
			String text = Java Exercise 
  			Index for character E and s     */

			        String str = "Java Exercise";
			        System.out.println("Given String = " + str);
			      
			        int ich1 = str.charAt(5);
			        int ich2 = str.charAt(11);

			       
			        System.out.println("The character at position 5 is " +
			            (char)ich1);
			        System.out.println("The character at position 11 is " +
			            (char)ich2);
			    }
			}
	