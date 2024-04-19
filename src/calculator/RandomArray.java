package calculator;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		
		Random random = new Random();
		
		for(int i =0; i < a.length ; i ++) {
			a[i] = random.nextInt(100);
			System.out.println(a[i]);
		}
		
		System.out.println("The Random lenght " + random[i]);
		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



//public class UseOfArray10 {
//	public static void main(String[] args) {
//		int[] a = new int[5];
//
//		Random random = new Random(); // class
//
//		for (int i = 0; i < a.length; i++) {
//			a[i] = random.nextInt(100); // if has boundary
//			System.out.println(a[i]);
//		}
//		System.out.println("To find the list of an Array: " + Arrays.toString(a));
//
//	}
//
//}
