package classInheritence;

public class Booking {
	int a = 10;
	int b= 20;
	
	/*
	 * public Booking() {
	 * System.out.println(" Thhis is default constructor FROM bOOKING "); }
	 */
	
	
	  public void cal () { addition(); }
	 
	
	public void addition() {
		int total = a + b;
		System.out.println("The total is : " + total);
	}

}
