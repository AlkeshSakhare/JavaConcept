package codingChallange;

import java.util.Scanner;

public class Add2Integer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a = scanner.nextInt();
		System.out.println("Enter 2nd no");
		a = a + scanner.nextInt();
		System.out.println("Sum of entered interger: " + a);
	}

}
