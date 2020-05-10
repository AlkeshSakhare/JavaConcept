package codingChallange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDate1 = "31/12/1998";
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Original Date: " + sDate1 + "\nCoverted Date: " + date1);
	}

}
