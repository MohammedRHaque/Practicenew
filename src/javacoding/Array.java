package javacoding;

public class Array {
	
	public static void main(String[] args) {
		
		int number []= {10, 12, 65,98,44, 38,79,4, 23};
		
		int largest = number [0];
		int smallest = number [0];
		
		for(int i =0; i < number.length ; i ++) {
			if (number [i] > largest ) {
				largest = number [i];
			}
			
			else if(number [i] < smallest) {
				smallest = number[i];
			}
		}

  System.out.println(largest);
  System.out.println(smallest);

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int [] number = {15,18,17,9,8};
//		int  largest = number[0];
//		int smaller = number[0];
//		
//		for (int i=1; i<number.length; i ++) {
//			if (number[i]> largest) {
//				largest = number[i];
//			}
//			else if (number[i]<smaller) {
//				smaller=number[i];
//			}
//		}
//	System.out.println(largest);
//	System.out.println(smaller);
//	}
}
