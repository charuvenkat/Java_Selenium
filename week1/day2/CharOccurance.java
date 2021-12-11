package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Welcome to chennai";
		int c=0;
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)=='e') {
				c++;
			}
		}
		System.out.println("Character e Occurance Count = " + c);
		
		
	}

}
