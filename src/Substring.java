

public class Substring {
	String  s1 = "My name is John. ";
	String s2 = "My name is John. ";
	String s3 = "MY NAME IS JOHN. ";
	String s4 = "MY NAME IS JOHN. ";
	
	
	
	public  void watch() {
		System.out.println("Is s1 equal to s2? Ans: " + s1.equals(s2));
		System.out.println("Is s1 equal to s3? Ans: " + s1.equals(s3));
		System.out.println("Is s1 equal to s4? Ans: " + s1.equals(s4));
		System.out.println("Is s3 equal to s4? Ans: " + s3.equals(s4));
	}
	public void watch2 () {
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s1==s2);
		System.out.println("Is it True? Ans: " + s1==s2); 
		// Why false? get it? because "xxxxxxx" + s1 ----> is concatenating and then comparing with s2
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
	}

public static void main(String[] args) {
	 Substring ot = new Substring();
	 ot.watch();
	 System.out.println("<<<<<<<<>>>>>>>");
     ot.watch2();
}
}
