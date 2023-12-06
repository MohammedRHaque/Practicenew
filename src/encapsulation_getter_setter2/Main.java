package encapsulation_getter_setter2;

import java.io.ObjectInputStream.GetField;
import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		Contact c = new Contact("Abdullah", 0171707665,  1, null, null, 2000, 101);
		
		System.out.println("The Guest Stayed : " + c.getGuestname() + " Conact No: "+ c.getContactno() + "\n Check in Date: " +c.getCheckinDate() + "\n Check out Date: " + c.getCheckoutDate() + "\n No of Nights: " + c.getNoofNights() +" \nTotal Payment: " + c.getPayment()+ "\n check out Room: " + c.getRoomno() );
		System.out.println("Next update price will be updated");
	    
	}
	

}

	