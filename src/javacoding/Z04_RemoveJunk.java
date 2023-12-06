package javacoding;

public class Z04_RemoveJunk {
public static void main(String[] args) {
	
	
		
		
	String s = "(*(999Zz88589I(L$o@v%e Coding";
	String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s1);
	
}
}
