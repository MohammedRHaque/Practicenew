package calculator;

public class CountString {
	
	public static void main(String[] args) {
		
		
		String name = "There is a will there is a way";
		int count = 0;
		
		for (int i =0; i <name.length(); i ++) {
			if(name.toLowerCase().charAt(i) == 'a') {
				count++ ;
			}
		}
		System.out.println(count);
		
	}

}
