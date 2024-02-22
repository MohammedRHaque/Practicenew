package useofEnum;

import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Test {
	public static void main(String[] args) {
		Shirt shirt = new Shirt();
  
		Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a Input");
		scanner.nextLine();

		
      shirt.findmyshirt();
	
		
		scanner.close();
		
      
      
		
		
	}
	
	

}
