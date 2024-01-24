package calculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetimenew = LocalDateTime.now();
		System.out.println(datetimenew);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, DD, MM, YYYY, hh:mm:ss" );
	  String datetime = datetimenew.format(dateTimeFormatter);
	  System.out.println("New" + datetime);
	}
}
