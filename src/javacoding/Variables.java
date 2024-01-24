package javacoding;

import java.security.Identity;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class Variables {
	
	//String name = "Mohammed Rafez ul Haque";
	String name2 = "Rahman";
 int id = 100;
	int salary =500;
	
	public Variables() {
		System.out.println("This is default constructor");
	}
	
	public final  void abc () {
		System.out.println("This is a method");
		
	}
	

	public static void main(String[] args) throws NumberFormatException {
		Variables v = new Variables();
	// System.out.println(v.name.length());
	 System.out.println(v.id + v.salary);
	 
	 String name = "Farjatun Akther Fabiha";
	 String s3= "Farjatun Akther Fabiha";
	 String s2= "Farjatun Akther Fabiha";
	String[] name1= s2.split("");
	System.out.println(Arrays.toString(name1));
	 
	 
	System.out.println(name.length());
	
	//Reverse the 
	
	for (int i =0; i<name.length(); i++) 
	{		System.out.print(name.charAt(i));
}
	System.out.println("\n<<<<<<<<<<Reverse>>>>>>>");
	for (int j = name1.length-1; j >=0; j--) {
		System.out.print(name1[j]);
	}
	System.out.println("\n new<<<<<>>>>>>");
	for(int k=s3.length()-1; k >=0; k--) {
		System.out.print(s3.charAt(k));
	}
	
	}

}
