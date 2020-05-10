package codingChallange;

import java.util.Scanner;

public class CheckEmptyOrNullString_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		String s = new Scanner(System.in).nextLine();
		System.out.println("Entered String: " + s);
		if (s.isEmpty() || s == null) {
			System.out.println(s + " is empty or null");
		} else {
			System.out.println(s + " is not empty or null");
		}
	}

}
