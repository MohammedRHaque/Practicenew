package useOfEnume;

public class TestShirt {
	
	public static void main(String[] args) {
		
		Shirt shirt = new Shirt(Size.Large);
		
		shirt.findmyshirt();
		
		Shirt s = new Shirt(Size.Medium);
		s.findmyshirt();
	}

}
