package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestInArray {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7};
		List<Integer> ldata=new ArrayList<Integer>();
		for(Integer i:data) {
		ldata.add(i);
		}
		Collections.sort(ldata);
		System.out.println("Sorted Array : " + ldata);
		System.out.println("Second Largest in sorted array :" + ldata.get((ldata.size()-2)));

	}

}
