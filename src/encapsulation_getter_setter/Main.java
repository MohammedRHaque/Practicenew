package encapsulation_getter_setter;

import javax.naming.AuthenticationException;

public class Main {

	public static void main(String[] args) {
	 Cars c= new Cars();
	 c.setName("BWM");
	 c.setPrice(50000);
	 c.setModel(2022);
	 System.out.println("The car model: " +c.getName() + "\nPrice:"+c.getPrice()+ "\nModel:" +c.getModel());
	 
	 
	 
	}

}
