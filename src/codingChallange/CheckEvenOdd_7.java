package codingChallange;

import java.util.Scanner;

public class CheckEvenOdd_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter integer");
		int a = new Scanner(System.in).nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is Even no");
		}
		else {
			System.out.println(a + " is Odd no");
		}
	}

}
