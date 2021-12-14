package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		
		
		List<String> sor = new ArrayList<String>();
		
		sor.add("HCL");
		sor.add("Wipro");
		sor.add("Aspire Systems");
		sor.add("CTS");
		System.out.println("Length of the Array = " + sor.size() + "\n");
		
		
		System.out.println("The elements of the list before performing sorting:\n" + sor + "\n");  
		
		Collections.sort(sor);
		System.out.println("The elements of the list after performing sorting:\n" + sor + "\n"); 
		
		Collections.sort(sor, Collections.reverseOrder());
		System.out.println("The elements of the list - reverse sorting:\n" + sor +"\n");
		
	
		
				
	}

}
