package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrintDuplicates {

	public static void main(String[] args) {
		
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> num = new ArrayList<Integer>();
		
		for(Integer i : arr) {
		num.add(i);
		}
		System.out.println("Array List  " + num  + "\n");
		Collections.sort(num);
		System.out.println("Sorted Array List  " + num  + "\n");
		
		List<Integer> obj = new ArrayList<Integer>();
		
		for(Integer j:num){
            if(!obj.contains(j)){
                obj.add(j);

            }
            
        }
		System.out.print("Removed Duplicates from the array List "  +obj);
        

		
	
	}

}
