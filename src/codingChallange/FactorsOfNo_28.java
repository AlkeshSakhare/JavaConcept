package codingChallange;

import java.util.Scanner;

public class FactorsOfNo_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no");
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		if (count == 0) {
			System.out.println(n + " factor is " + 1);
		}
	}
}
