package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetRemoveStringDuplicates {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		System.out.println("Given String = We learn java basics as part of java sessions in java week1 \n");
		
		String[] str1=text.split(" ");
		
		Set<String> dset=new LinkedHashSet<String>();
		
		for (String s : str1) {
			
			dset.add(s);
		}
		
		System.out.println("Removed Duplicates from the above String");
		System.out.println(dset.toString());
	}

}
