package switchMethod;

import java.util.Base64;

public class Shirt {
	
	Size chart;
	
	public Shirt (){
		System.out.println("This is default constructor");
	}

	public Shirt (Size chart) {
		this.chart = chart;
	}
	
	public void findmyshirt() {
		
		switch (chart) {
		case Small:
			 System.out.println("This is small size shirt");
			break;
		case Large:
			System.out.println("This is large size Shirt");
			break;
		case Xlarge:
			System.out.println("This is Large size Shirt");
			break;
			
		default:
			System.out.println("There is not shirt matched");
			break;
		}
		
		
		
	}
	
}
