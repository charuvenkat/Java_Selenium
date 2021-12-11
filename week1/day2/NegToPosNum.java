package week1.day2;

public class NegToPosNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-40;
		if (num<0) {
			//System.out.println(num + "   " + "Number is converted to positve number" + "   "  + ~(num-1));
			System.out.println(num + "\n" +"Number is converted to positve number = " + num*-1);
			//System.out.println(num + "   " +"Number is converted to positve number" + Math.abs(num));
		}else
		System.out.println("Given number is Positive : " + num);
	}

}
