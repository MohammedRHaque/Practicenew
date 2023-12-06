package javacoding;

public class Z02_primeNumber {

	//easy way to findout a Prime No 
	
	public static boolean isPrimeNo (int n ) {
		
		if (n <=1) {
			return false;
		}
				
	 for(int i =2; i<n; i++) {
			if(n%i ==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is an Prime no True or False : " +isPrimeNo(7));
	}
}
