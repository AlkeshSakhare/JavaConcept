package codingChallange;

import java.util.Scanner;

public class CheckVowelConsonent_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character");
		char c = new Scanner(System.in).nextLine().toLowerCase().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println(c + " is  vowel");
		}
		else {
			System.out.println(c + " is consonent");
		}
	}

}
