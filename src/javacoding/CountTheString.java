package javacoding;



public class CountTheString {
	
	public static void main(String[] args) {
		
		String s = "There is a will there is a way EEE";
		
		int count = 0;
		
		for( int i =0; i< s.length(); i ++) {
			if(s.toLowerCase().charAt(i) == 'e') {
				count ++ ;
			}
		}
		System.out.println(count);
	}
	
	
}
//String name = "Zinedin zidan zoradn Z";
//int count = 0;
//
//for (int i = 0; i < name.length(); i++) {
//	if (name.toLowerCase().charAt(i)=='z') {
//		count++;
//	}
//
//}
//System.out.println(count);
//}