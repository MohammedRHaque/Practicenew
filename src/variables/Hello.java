package variables;

import java.util.function.IntConsumer;

public class Hello {
	static String name =  "Hamid";
	 static byte age = 100;
	 short myApartmentRent = 32767;
	 int myYearlySalary = 472635467;
	 int a =50;
	 int b = 25;
	 public Hello (){
		System.out.println("This is a default constructor"); 
	 }
	 
	 public int addition () {
		
		 int tota1= a  + b;
		 System.out.println(tota1);
		 int deduct = a- b;
		 System.out.println(deduct);
		int mul = a*b ;
		System.out.println(mul);
		return 0;
	 }
	 
	 public static void main(String[] args) {
		Hello hello = new Hello();
	 
	 System.out.println("The total value" +hello.addition());
		System.out.println("<<<<<<<<>>>>>>");
		 System.out.println( name  + "\n "+ age   + "\n\t " +hello.myApartmentRent + "\n " + hello.myYearlySalary );
	}
	
}
