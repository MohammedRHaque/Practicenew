package javaConstructor;

public class Test {

	public String name ;
	public int age ;
	public char sex ;
	public boolean liveInNy ;
	
	public Test() {
		System.out.println("This is a deafult constructor ");
		
		
	}
	public Test(String name, int age, char sex, boolean liveInNy) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.liveInNy = liveInNy;
	}
	
}
