package codingChallange;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile_86 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./TestData/Test.txt");
		File copyfile = new File("./TestData/Testcopy1.txt");
		Files.copy(file.toPath(), copyfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}

}
