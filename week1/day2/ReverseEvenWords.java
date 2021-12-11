package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "I am a Software Tester";
		
		String[] words = test.split(" ");
			
		System.out.println(Arrays.toString(words));
		
		String[][] wordsArray = new String[words.length][];
		
		for (int i = 0; i < words.length; i++) {
		    wordsArray[i] = new String[] {words[i]};
		System.out.println(Arrays.deepToString(wordsArray));
		
		for(int j=0;j<0;j--)
		{
	//	System.out.println(wordsArray(i)[j]);
			
		}
		}
	}

}
