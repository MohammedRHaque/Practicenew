package javacoding;

public class Z01_factorialNumber {
	
	//5! = 5*4*3*2*1
	
	public static int recFactorial (int n){
		
		if (n==0) {
			return 1;
			} else {
				return n*recFactorial(n-1);
			}
	
		
	}

	public static void main(String[] args) {
		System.out.println(recFactorial(5));
	}
	
}
