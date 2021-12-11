package week1.day2;

public class DuplicateInArr {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int[] arr= {14,12,6,6,13,14,13};
		int len= arr.length;
		int c=0;
		//System.out.println(len);
		System.out.println("Duplications elements are");
		for(int i= 0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				//	System.out.println("j intersection" + arr[j]);
						c=c+1;
					
					}
				
			}
			
			}
		
		System.out.println("Total count = " + c);
		}
	}

