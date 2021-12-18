package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class MapSecondLargestChar {

	public static void main(String[] args) {
		String str = "PayPalIndia";
		char[] chs= str.toCharArray();
		
		Map<Character,Integer> charocc= new HashMap<Character, Integer>();
		for(int i=0;i<chs.length;i++)
		{
		charocc.put(chs[i],charocc.getOrDefault(chs[i], 0)+1);
		
		}	
		System.out.println(charocc);
		
		
		//Aruguments Passing Values from  Map to List
		List<Integer> list=new ArrayList<Integer>(charocc.values());
		
		//Sorting List values
		Collections.sort(list);
		System.out.println(list);
		
		//Getting Second Largest from the List
		int v1=list.get(list.size()-2);
		System.out.println("The Second largest Occurance character count  "+ v1);
		
		//Getting the Key from the map using the value
		for(Map.Entry<Character,Integer> entry: charocc.entrySet()){
			
			if(entry.getValue() == v1) {
				
				System.out.println("The Key for the value   " + v1 + "  is  " + entry.getKey());
			}
			
		}
		
	}

}



