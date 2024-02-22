package classInheritence;



public class Airbnb  {
	
	
	public void newmethod () {
		//cal();
	}
	public static void main(String[] args) {
		Booking book = new Booking();
		
		Airbnb airbnb = new Airbnb();
		airbnb.newmethod();
		System.out.println("<<<<<>>>>>>  bEFORE cal method below");
		book.addition();
		System.out.println("<<<<<>>>>>>  cal method below");
		book.cal();
	}
	
	
 
		
	
	



	
	
}
