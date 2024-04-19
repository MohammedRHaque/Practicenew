package useOfEnume;

public class Shirt {
	
	Size chart;
	
	public Shirt (){
		
	}
	
   public  Shirt(Size chart) {
	   this.chart = chart;
   }
   
   public void findmyshirt() {
	   
	   switch (chart) {
	case Small:
		System.out.println("This is small size");
		break;
	case Large:
		System.out.println("This is Large size Shirt");
	default:
		System.out.println("There is no Entry match");
		break;
	}
	  
	   
	   
   }
   
}
