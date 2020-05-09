package codingChallange;

import java.util.Scanner;

public class CheckPostiveNegativeNo_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double no = new Scanner(System.in).nextDouble();
		if (no > 0) {
			System.out.println("No is positive");
		}
		else if (no == 0) {
			System.out.println("No is zero ");
		}
		else {
			System.out.println("No is negative");
		}
	}

}
