package codingChallange;

import java.util.Scanner;

public class CheckPrimeNo_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		int a = new Scanner(System.in).nextInt();
		boolean isPrime = false;
		if (a > 2) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				isPrime = true;
				break;
			}
		}
		if (isPrime)
			System.out.println(a + " is not a prime no");
		else
			System.out.println(a + " is a prime no");
		} else if (a == 2) {
			System.out.println(a + " is a prime no");
		}
		else
			System.out.println(a + " is not a prime no");
	}

}
