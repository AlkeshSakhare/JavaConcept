package codingChallange;

import java.util.Scanner;

public class FindFactorialOfNo_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter whole no");
		int a = new Scanner(System.in).nextInt();
		int fact = 1;
		if (a == 0 || a == 1) {
			System.out.println(a + "! = " + fact);
		} else {
			for (int i = 2; i <= a; i++) {
				fact = fact * i;
			}
			System.out.println(a + "! = " + fact);
		}
	}

}
