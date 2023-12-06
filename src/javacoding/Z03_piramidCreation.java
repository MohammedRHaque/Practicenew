package javacoding;

public class Z03_piramidCreation {

	public static void piramid (int n) {
		
		for(int i =0; i<n; i++) { //0 1 2 3 4
		for(int j=0; j<n-i; j++) {  //01234 // 0123 //012//01//0 
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		
	}
	
 public static void main(String[] args) {
	piramid(5);
}
}