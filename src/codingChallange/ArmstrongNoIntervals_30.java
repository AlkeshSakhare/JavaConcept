package codingChallange;

import java.util.Scanner;

public class ArmstrongNoIntervals_30 {

	static void findArmstrong(int low, int high) {
		for (int i = low + 1; i < high; ++i) {

			// number of digits calculation
			int x = i;
			int n = 0;
			while (x != 0) {
				x /= 10;
				++n;
			}

			// compute sum of nth power of
			// its digits
			int pow_sum = 0;
			x = i;
			while (x != 0) {
				int digit = x % 10;
				pow_sum += Math.pow(digit, n);
				x /= 10;
			}

			// checks if number i is equal
			// to the sum of nth power of
			// its digits
			if (pow_sum == i)
				System.out.print(i + " ");
		}
	}

	// Driver code
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = s.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = s.nextInt();

		findArmstrong(num1, num2);
		System.out.println();
	}
}