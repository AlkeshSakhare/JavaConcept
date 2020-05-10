package codingChallange;

import java.util.Scanner;

public class RemoveWhileSpaceFromString_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		String s = new Scanner(System.in).nextLine();
		System.out.println("String before removing space:" + s);

		s = s.replace(" ", "");
		System.out.println("String after removing space:" + s);

	}

}
