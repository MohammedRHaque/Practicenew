package javacoding;

public class Z10_Find_Largest_Smallest_No {

		public static void main(String[] args) {
			int [] number = {20, 30, 500,200, 10, 1,220};
			int largest = number[0];
			int smallest = number [0];
			
			for(int i=0; i<number.length; i++ ) {
				if (number[i]>largest ) {
					largest = number[i];
				}
			}
			
			for(int j=0; j<number.length; j ++) {
				if(number[j]<smallest) {
					smallest= number[j];
				}
			}
					
			System.out.println("The largest No: "+ largest);
			System.out.println("The smallest No: " + smallest);
			
			
		}
}