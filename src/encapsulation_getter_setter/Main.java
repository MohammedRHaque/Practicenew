package encapsulation_getter_setter;


public class Main {
	

	public static void main(String[] args) {
		int [] list = new int [100];
		for(int i =0; i<list.length ; i ++) {
			System.out.println("The total of " + i + " index value :" + list[i]);
		}
		
	}

	/*
	 * public static void main(String[] args) { Cars c= new Cars();
	 * c.setName("BWM"); c.setPrice(50000); c.setModel(2022);
	 * System.out.println("The car model: " +c.getName() + "\nPrice:"+c.getPrice()+
	 * "\nModel:" +c.getModel());
	 * 
	 * 
	 * 
	 * }
	 */
}
