package codingChallange;

import java.util.Scanner;

public class CalcUsingSwitch_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();
		System.out.print("Enter the second number : ");
		int end = s.nextInt();
		System.out.println("Enter operator : ");
		String op = s.next();
		System.out.println("Operator is : " + op);
		switch (op) {
		case "+":
			System.out.println(start + " + " + end + " = " + (start + end));
			break;
		case "-":
			System.out.println(start + " - " + end + " = " + (start - end));
			break;
		case "*":
			System.out.println(start + " x " + end + " = " + (start * end));
			break;
		case "/":
			System.out.println(start + " / " + end + " = " + (start / end));
			break;
		default:
			System.out.println("Please enter valid operator as + - x /");
			break;
		}
	}

}
