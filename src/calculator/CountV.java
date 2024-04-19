package calculator;

import java.util.Random;

public class CountV {
	
		public static void main(String[] args) {
			
			Random ran = new Random();
			
			int a =ran.nextInt();
			int b = ran.nextInt();
			
			System.out.println(" first no" + a);
			System.out.println( "second no" + b);
			
			int c = ran.nextInt(100);
			
			boolean d = ran.nextBoolean();
			
			System.out.println(c );
			System.out.println(d);
		}	
	
	
	
	
}

//
//	public static String countv (String s) {
//		
//		s = s.toLowerCase();
//		s= s.replaceAll("\\s", "");
//		
//		int count = 0;
//		
//		for(int i =0; i < s.length(); i ++) {
//		if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt( i)=='i' || s.charAt(i)== 'o'|| s.charAt(i)== 'u' ) {
//			 
//			count ++ ;
//		}
//			
//		}
//		System.out.println("Total vowel is " + (s.length()-count));
//				return s;
//				
//	}
//
//	public static void main(String[] args) {
//
//		countv("There is a will there is a way");
//
//	}
//}
