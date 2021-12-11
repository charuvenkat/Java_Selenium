package week1.day1;

import java.util.Arrays;



public class ArrSecLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};

		Arrays.sort(data);
		int len=data.length-2;
		
		System.out.println(data[len]);
	}

}
