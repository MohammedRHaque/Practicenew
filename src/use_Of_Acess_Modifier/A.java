package use_Of_Acess_Modifier;

public class A {
	
	public String info ="This is coming from Varibale which is public";
	
	public A() {
		System.out.println("This is constructor which is Public");
	}
	public void  msg1() {
		System.out.println("This is a Method  which is public  ");
	}
	
	public static void main(String[] args) {
		System.out.println("Public Modifier can access within the Class");
		System.out.println("Public Modifier can access within the package");
		A a = new A();
			System.out.println(a.info);
		a.msg1();
		
	}

}
