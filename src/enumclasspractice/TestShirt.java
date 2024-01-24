package enumclasspractice;

import java.util.Scanner;

import useofEnum.Size;

public class TestShirt  {

	public static void main(String[] args) {
		
		BrandShop shop = new BrandShop();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size for output");
		scanner.next();
		shop.findMyShirt();
		scanner.close();
		
		
		
		
	}
}
