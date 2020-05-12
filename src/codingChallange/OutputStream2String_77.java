package codingChallange;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStream2String_77 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		String line = "Hello there!";

		stream.write(line.getBytes());
		String finalString = new String(stream.toByteArray());

		System.out.println(finalString);
	}
}
