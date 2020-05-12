package codingChallange;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringFromTxtFile_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("./TestData/Test.txt");
			Scanner sc = new Scanner(reader);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
