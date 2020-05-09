package codingChallange;

import java.util.Scanner;

public class CheckLeapYear_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year");
		int year = new Scanner(System.in).nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is leap year");
				} else {
					System.out.println(year + " is not leap year");
				}
			} else {
				System.out.println(year + " is leap year");
			}
		} else {
			System.out.println(year + " is not year");
		}
	}

}
