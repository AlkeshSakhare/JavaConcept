package codingChallange;

import java.util.Scanner;

public class SumOfNaturalUsingRecursive_34 {

	static int total = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Sum of " + a + " natural no is " + sum(a));
	}

	private static int sum(int a) {
		// TODO Auto-generated method stub
		total = total + a;
		a--;
		if (a > 0) {
			sum(a);
		}
			return total;
	}
}
