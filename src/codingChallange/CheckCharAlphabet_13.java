package codingChallange;

import java.util.Scanner;

public class CheckCharAlphabet_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter character");
		char c = new Scanner(System.in).nextLine().charAt(0);
		if(c<='z' && c>='A')
		{
			System.out.println("Entered character is " + c + " an alphabet");
		}
		else {
			System.out.println("Entered character is " + c + " not an alphabet");

		}
	}

}
