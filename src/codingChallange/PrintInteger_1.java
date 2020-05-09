package codingChallange;

import java.util.Scanner;

public class PrintInteger_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter integer");

		try {
			int no = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.println("You have entered integer: " + no);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter integer only");

		}

	}

}
