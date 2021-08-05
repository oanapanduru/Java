package strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
	    System.out.println("Before formatting: " + date);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

	    String formattedDate = date.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}
