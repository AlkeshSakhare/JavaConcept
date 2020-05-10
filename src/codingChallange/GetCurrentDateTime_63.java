package codingChallange;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GetCurrentDateTime_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time is: " + current);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String formatted = current.format(formatter);
		System.out.println("Current Date and Time is: " + formatted);

		formatter = DateTimeFormatter.BASIC_ISO_DATE;
		formatted = current.format(formatter);
		System.out.println("Current Date is: " + formatted);

		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		formatted = current.format(formatter);
		System.out.println("Current Date is: " + formatted);

	}

}
