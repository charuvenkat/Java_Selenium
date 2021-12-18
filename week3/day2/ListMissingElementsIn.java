package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListMissingElementsIn {

	public static void main(String[] args) {
		// check with mentor correct way

		

		int[] num = {1,4,5,0};
		
		List<Integer> ldata = new ArrayList<Integer>();
		 for(Integer i : num)
			 ldata.add(i);
		 Collections.sort(ldata);
		 System.out.println(ldata);
		 int s=0;
	for (int j = 0; j < num.length; j++) {
			
			if(s != ldata.get(j)) {
				System.out.println("Missing number in the list : " + s);
				s++;
			}
			else {
			s++;
			}
		}
		}
	
	}

