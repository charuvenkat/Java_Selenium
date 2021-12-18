package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionsFindIntersection {

	public static void main(String[] args) {
		
	//Using List
		
		Integer arr1[] = {3,2,11,4,6,7};
		Integer arr2[] = {1,2,8,4,9,7};
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
	
		list1.addAll(Arrays.asList(arr1));
		list2.addAll(Arrays.asList(arr2));
		System.out.println(list1);
		System.out.println(list2);
		list1.retainAll(list2);
		
		System.out.println("Instersection elements are : " + list1);
		
		//Using Set
		
	/*	int[] val = {3,2,11,4,6,7};
		int[] val2 = {1,2,8,4,9,7};
		

		Set<Integer> vset=new LinkedHashSet<Integer>();
		
		for (Integer i : val) {
			
			vset.add(i);
			
		}
		System.out.println(vset);
		
		Set<Integer> v2set=new LinkedHashSet<Integer>();
		
		for (Integer j : val2) {
			
			v2set.add(j);
			
		}
		System.out.println(v2set);
		
		vset.retainAll(v2set);
	      System.out.println("Intersection = "+ vset);
		}*/
		
		
		
		
		

	}

}
