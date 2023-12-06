package javacoding;

import javax.xml.xpath.XPath;

public class Z05_SwapInteger {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 6;
		
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("The x Value is " + x);
		System.out.println("The Y value is " + y);
		
	}
}
