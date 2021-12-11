package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,11,4,6,7};
		int[] secarr= {1,2,8,4,9,7};
		System.out.println("The Intersection elements are :");
		for(int i=0;i<arr.length;i++) {
			
			for (int j=0;j<secarr.length;j++) {
				if(arr[i]==secarr[j]) {
				//System.out.println("i=Intersection are : " + arr[i]);
				//System.out.println("j=Intersection are : " + secarr[j]);
					System.out.println(arr[i]);
				}
			}
		}
	}

}
