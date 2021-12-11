package week1.day1;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range =8, fn=0, sn=1;
int sum;
System.out.println(fn);
for (int i=1; i<range; i++) {
	sum=fn+sn;
	sn=fn;
	fn=sum;
	
	System.out.println(sum);
	
}
	}

}
