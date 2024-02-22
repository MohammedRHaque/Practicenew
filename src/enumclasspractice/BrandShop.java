package enumclasspractice;

public class BrandShop {

	Shirt size;

	public BrandShop() {

	}

	public BrandShop(Shirt size) {
		this.size = size;
	}

	public void findMyShirt() {
		switch (size) {
		case Small:
			System.out.println("This is small size Shirt");
			break;
		case Large:
			System.out.println("This is large size Shirt");
			break;

		case Xlarge:
			System.out.println("This is X Large size shirt");
			break;
		case XXlarge:
			System.out.println("This is XXlarge shirt");
			break;
		default:
			System.out.println("The size you entered is not matched");
			break;
		}

	}

}
