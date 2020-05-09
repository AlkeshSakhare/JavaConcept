package codingChallange;

import java.util.Scanner;

public class PowerOfNo_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("Enter power");
		double b = new Scanner(System.in).nextDouble();
		System.out.println(a + "^" + b + " = " + Math.pow(a, b));
	}

}
