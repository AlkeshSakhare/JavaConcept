package codingChallange;

import java.util.Scanner;

public class MultiplicationTable_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter whole no");
		int a = new Scanner(System.in).nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

}
