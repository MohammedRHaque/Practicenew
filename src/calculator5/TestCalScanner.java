package calculator5;

import java.util.Scanner;

public class TestCalScanner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		int total = a +b;
		
		System.out.println("Total value of addition " + total + "\n Thanks for the result");
		
		scanner.close();
	}

}


