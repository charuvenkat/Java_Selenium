package week1.day2;

import java.util.Arrays;

public class MissingElemArray {

	public static void main(String[] args) {

		int[] arr = {1,4,5,0};
		//int y;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
		if (arr[i]!=i) {				
				System.out.println("Number Not exist " + i);
				break;
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int j=arr[arr.length-1];
		
		for(int x=0;x<=j;x++) {
			
		for(int i=0;i<arr.length;i++) {
			y = 1;
		if (arr[i]==x) {				
				System.out.println("Number exist " + x);
				 y = 1;
				break;
			}
			else
			{
				//System.out.println(arr[i]);
				//System.out.println(j);
				 y = 2;
				System.out.println("Number not exist " +x);
	
			}
		
			}
	}*/
	}
}




/*int[] data= {3,2,11,4,6,7};

Arrays.sort(data);
int len=data.length-2;

System.out.println(data[len]);*/