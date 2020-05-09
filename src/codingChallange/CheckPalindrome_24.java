package codingChallange;

import java.util.Scanner;

public class CheckPalindrome_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		int a = new Scanner(System.in).nextInt();
		String no = String.valueOf(a);
		StringBuffer buffer = new StringBuffer(no);
		int reverse = Integer.parseInt(buffer.reverse().toString());
		if (a == reverse) {
			System.out.println(a + " is a palindrome");
		}
		else {
			System.out.println(a + " is not a palindrome");
		}
	}

}
