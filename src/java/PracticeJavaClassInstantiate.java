package java;

public class PracticeJavaClassInstantiate {
public static String name = "Mohammed Rafez";

public byte age = 42;
public char sex = 'M';
public int salary = 8000;
public short yearlySalary = 12000;
public long bankBlance = 56757657576l;
public boolean liveinNY = true;

public static void main(String[] args) {
	PracticeJavaClassInstantiate info = new PracticeJavaClassInstantiate();
	
	System.out.println(name + info.age);
	System.out.println("My Name is " + name);
	
	

}


}
