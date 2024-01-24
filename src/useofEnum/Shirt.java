package useofEnum;

public class Shirt {
    static String s ;
    static char c;
    
	Size chart;

	public Shirt() {

	}

	public Shirt(Size chart) {
		this.chart = chart;
	}

public static void main(String[] args) {
	
		System.out.println(s);
		System.out.println("value of Char" + c);
	
}
	public void findmyshirt() {
		switch (chart) {
		case x:
			System.out.println("This is Large    size Shirt");
			break;
		case y:
			System.out.println("This is Medium Type Shirt");
		case z:
			System.out.println("This is xl size");
			break;
		default:
			System.out.println("The size is not avialable");
			break;

		}

	}

}
