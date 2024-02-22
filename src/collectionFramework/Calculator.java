package collectionFramework;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Calculator {

	private static final String Void = null;

	public static void main(String[] args) {
		
		int a;
		int b;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give a input");
		
		a = scanner.nextInt();
		System.out.println("Please give another input");
		
		b = scanner.nextInt();
		 
	   int addition =a +b;
	   int sub = a-b;
	   int mul = a*b;
	   int div = a/b;
	   
	   System.out.println("addition " + addition + "\n Substraction " + sub + "\n Multiplication " + mul + "\n division " + div);

		
	}
	
}
