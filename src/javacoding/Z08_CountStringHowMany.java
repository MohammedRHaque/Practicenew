package javacoding;

import org.xml.sax.ext.Attributes2;

public final class Z08_CountStringHowMany {
public static void main(String[] args) {
	String s = "Robin Roni Roxi";
	String s1 = "ThEre is a will thEre is a Way, Yes, truE";
	int count = 0;
	int count2 = 0;
	
	//how to count a specific character in one case
	for (int i =0;i < s.length(); i ++) {
		if(s.charAt(i) =='o') {
			count++;
		}
	}
	
	//how to convert upercase & count all Character here e we r counting
	for(int i = 0; i<s1.length(); i ++) {
		if(s1.toLowerCase().charAt(i)=='e') {
			count2 ++;
		}
	}
	
	System.out.println("There is total Character is : " + count);
	System.out.println("There is total Character is : " + count2);
	
}
	
}
