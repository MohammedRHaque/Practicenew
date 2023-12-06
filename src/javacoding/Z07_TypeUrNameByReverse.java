package javacoding;

public class Z07_TypeUrNameByReverse {

	public static void main(String[] args) {
		
		String s = "Mohammed Rafez ul Haque";
		String s1 = "Mohammed Rafez ul Haque";
		String s2 = "Mohammed Rafez ul Haque";
		
		
		for(int i=0; i<s.length(); i ++) {
			System.out.print(s.charAt(i));
			
		}
		System.out.println("\n ........................");
		for(int i=s1.length()-1; i >=0; i --) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n .....................");
		
		for(int i=s2.length()-1; i >=0; i--) {
			System.out.print(s2.charAt(i));
			
		}
	}
	
}
