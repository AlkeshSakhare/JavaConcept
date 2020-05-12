package codingChallange;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class File2ByteArray2File_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String filePath = "./TestData/Test.txt";
			byte[] encoded = Files.readAllBytes(Paths.get(filePath));
			System.out.println(Arrays.toString(encoded));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
