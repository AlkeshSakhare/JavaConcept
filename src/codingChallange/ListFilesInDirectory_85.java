package codingChallange;

import java.io.File;
import java.util.Arrays;

public class ListFilesInDirectory_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(System.getProperty("user.dir"));
		System.out.println(Arrays.asList(file.list()));
	}
}
