package codingChallange;

import java.util.Scanner;

public class FrequencyOfCharInString_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		System.out.println("Enter a character whose frequecy needs to be find out");
		char ch = sc.nextLine().charAt(0);
		int freq = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch) {
				freq++;
			}
		}
		System.out.println("Frequency of " + ch + " in " + string + " = " + freq);

	}

}
