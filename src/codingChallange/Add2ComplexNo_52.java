package codingChallange;

import java.util.Scanner;


public class Add2ComplexNo_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter coefficients x & y of 1st complex no: x + yi ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter coefficients x & y of 2nd complex no: x + yi ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("1st complex no: " + a + "+" + b + "i");
		System.out.println("2nd complex no: " + c + "+" + d + "i");
		System.out
				.println("(" + a + "+" + b + "i) + (" + c + "+" + d + "i) = " + sum(a, c) + " + " + (sum(b, d) + "i"));
	}

	private static int sum(int a, int b) {
		return a + b;
	}
}
