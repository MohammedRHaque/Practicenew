package javacoding;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Z11_Reverse_The_Words_From_Paragraph {

	public static void main(String[] args) {
		
		String s = "There is a will therre is a way";
		String [] name = s.split(" ");
		System.out.println(Arrays.toString(name));
		
		for(int i = name.length -1; i>0; i--) {
			System.out.print(name[i] + " ");
		}
	}
	
	
}
 