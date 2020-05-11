package codingChallange;

import java.nio.file.Paths;

public class GetCurrentWorkingDirectory_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method 1: System.getProperty("user.dir");
		String userdir = System.getProperty("user.dir");
		System.out.println("userdir: " + userdir);

		// Method 2: Paths.get("").toAbsolutePath().toString();
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.println("Working Directory = " + path);
	}

}
