package calculator;

public class TestString {
	
	public static void main(String[] args) {
		
		String s1 = "Rafez";
		String s2 = "Farmis";
		
		System.out.println(s1);
		
		String s3 =   "  Mohammed Haque  ";
		
		
		System.out.println(s3.length());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.charAt(5));
		System.out.println(s1);
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.substring(0, 5));
		System.out.println(s3.trim());
		System.out.println(s3.equals(s1));
	    System.out.println(s3.replace('a', 'o'));
	    System.out.println(s3.concat(s2));
		
		
	}

}
