package javacoding;

import java.util.Iterator;

public class CountTheString {
	public static void main(String[] args) {

		String name = "Zinedin zidan zoradn Z";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.toLowerCase().charAt(i)=='z') {
				count++;
			}

		}
		System.out.println(count);
	}

}
