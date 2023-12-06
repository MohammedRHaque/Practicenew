package javacoding;

public class Array {
	
	public static void main(String[] args) {
		int [] number = {15,18,17,9,8};
		int  largest = number[0];
		int smaller = number[0];
		
		for (int i=1; i<number.length; i ++) {
			if (number[i]> largest) {
				largest = number[i];
			}
			else if (number[i]<smaller) {
				smaller=number[i];
			}
		}
	System.out.println(largest);
	System.out.println(smaller);
	}
}
