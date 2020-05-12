package codingChallange;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendText2File_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// if we pass true then only it will append text or else it will remove all data
			// and then it write data

			FileWriter file = new FileWriter("./TestData/Test.txt", true);
			BufferedWriter writer = new BufferedWriter(file);
			writer.newLine();
			writer.write("Hi this is sample text added");
			writer.close();
			FileReader rd = new FileReader("./TestData/Test.txt");
			Scanner sc = new Scanner(rd);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
