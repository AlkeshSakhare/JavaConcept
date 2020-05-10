package codingChallange;

import java.util.Scanner;

public class CountVowels_ConsonentInSentence_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		System.out.println("Enter a character whose frequecy needs to be find out");
		char ch = sc.nextLine().charAt(0);
		int freq = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == 'a' || c == 'u' || c == 'o' || c == 'i' || c == 'e') {
				freq++;
			}
		}
		System.out.println("Frequency of vowels" + " in " + string + " = " + freq);
		System.out.println("Frequency of consonents" + " in " + string + " = " + (string.length() - freq));

	}

}
