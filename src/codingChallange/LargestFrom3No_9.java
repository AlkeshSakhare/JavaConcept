package codingChallange;

import java.util.Scanner;

public class LargestFrom3No_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 nos");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is greater than " + b + " and " + c);
		}
		else if (b > c) {
			System.out.println(b + " is greater than " + a + " and " + c);

		}
		else {
			System.out.println(c + " is greater than " + a + " and " + b);

		}
	}

}
