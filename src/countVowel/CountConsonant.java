package countVowel;

public class CountConsonant {
	
	public static String consonant(String s) {
		
		s  = s.toLowerCase();
		s =s.replaceAll("\\s","");
		
		
		int count =0;
		
		for(int i =0; i<s.length(); i ++) {
			
			if(s.charAt(i)== 'a' || s.charAt(i) == 'e'|| s.charAt(i)== 'i'|| s.charAt(i)=='o'|| s.charAt(i)==  'u') {
				count ++;
			}
			
			
		}
		
		
		System.out.println("The total Consonant " + (s.length()-count));
		
		
		return s;
		
		
	}

	public static void main(String[] args) {
		consonant("Hello all people");
		
	}
}
