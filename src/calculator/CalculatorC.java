package calculator;

import java.util.Scanner;

public class CalculatorC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input");

		int a = scanner.nextInt();

		System.out.println("Enter the next Input");
		int b = scanner.nextInt();

		int total1 = a + b;
		int sub1 = a - b;
		int multi = a * b;
		int divis = a / b;

		
		System.out.println("The value of Addition :" + total1 + "substraction vallue :" + sub1 + "Multi value :" + multi + "The div value :" + divis);

		scanner.close();

	}

}
