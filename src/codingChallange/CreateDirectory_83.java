package codingChallange;

import java.io.File;

public class CreateDirectory_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Alkesh\\eclipse-workspace\\SwingDemo\\TestData\\TestDirectory");

		// tries to create a new directory
		boolean value = file.mkdir();
		if (value) {
			System.out.println("The new directory is created.");
		} else {
			System.out.println("The directory already exists.");
		}
	}

}
