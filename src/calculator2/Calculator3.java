package calculator2;

import java.util.Scanner;


public class Calculator3 {
	
	
	
	
	static Scanner scanner = new Scanner(System.in);
	

	
	

	
	static Scanner s = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		System.out.println("Enter  a input");
		int a = scanner.nextInt();
		System.out.println("Enter another input");
		int b = s.nextInt()	;
		
		
		int total1 = a+b;
		System.out.println("The total value is " + total1);
		int deduction = a-b;
		int multi = a*b;
		int division = a/b;
		
		System.out.println( "Deduction value is "+deduction +" Multi value" + multi + "Division Value" + division );
		
		
	}


	
}


