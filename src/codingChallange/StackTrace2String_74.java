package codingChallange;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTrace2String_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			// To print stack trace
			e.printStackTrace();

			// To convert stack trace into string
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			System.out.println(exceptionAsString);
		}
	}
}
