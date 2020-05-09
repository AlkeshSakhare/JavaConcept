package codingChallange;

import java.util.Scanner;

public class ReverseSentenceByRecursive_40 {
	static String reversesentence = "";

	public static void main(String[] args) {
		String sentence = "Go work";
		String reversed = reverse(sentence);
		System.out.println("The reversed sentence is: " + reversed);
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;
		String a = reverse(sentence.substring(1)) + sentence.charAt(0);
		return a;

	}
}
