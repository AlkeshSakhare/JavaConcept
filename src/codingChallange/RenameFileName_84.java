package codingChallange;

import java.io.File;

public class RenameFileName_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./TestData/testrename.txt");
		File file1 = new File("./TestData/testrename1.txt");

		if (file.renameTo(file1)) {
			System.out.println("File renamed to testrename1");
		} else {
			System.out.println("File renamed failed");
		}
		// file1.renameTo(file);
	}
}
