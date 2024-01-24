package javacoding;

public class CountVowel {

public static void main(String[] args) {
	
	String s = "There is a will there is a way";
	int count =0;
	
	for(int i =0; i < s.length() ; i++) {
		if(s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i)== 'e'|| s.toLowerCase().charAt(i)== 'i' ||
				s.toLowerCase().charAt(i) =='o'|| s.toLowerCase().charAt(i)== 'u' ) {
			count ++;
		}
	}
	System.out.println(count);
}	
	
}
