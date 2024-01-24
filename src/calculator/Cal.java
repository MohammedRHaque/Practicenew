package calculator;

import java.util.Scanner;

public class Cal {
	
	int a  ;
	int b ;
	
	
	
	

	public Cal(int a, int b) {
	
		this.a = a;
		this.b = b;
	}






	public Cal() {
		// TODO Auto-generated constructor stub
	}






	public int addition() {
		int total = a +b;
		return total;
		}
		
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give a input");
		int a = scanner.nextInt();
		
		System.out.println("Give another input");
	
		int b = scanner.nextInt();
		
		/*
		 * int total2 = a+b; int total1 = a -b; int total3 = a/b; int total4 = a*b;
		 */
		
		
		//System.out.println("Total is Addition:" + total2 +"\n Dudeuction : " + total1 + "\n Division :" + total3   );
		Cal cal = new Cal();
       int total2 = a +b;
		System.out.println("Scanner total" +total2);
		//System.out.println("This is form Para Constructor "+ cal2.addition());
		System.out.println(cal.addition());
		
	}

}
