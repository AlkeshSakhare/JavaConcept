package codingChallange;

import java.util.Scanner;

public class FiboonaciSeries_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter whole no till fiboonaci series to be printed");
		int a = new Scanner(System.in).nextInt();

		int firstNo = 1;
		int secondNo = 1;
		int sum = 1;
		System.out.println("fibbonaci series");
		System.out.print(firstNo + " ");
		System.out.print(secondNo + " ");

		for (int i = 0; i < a; i++) {
		
			sum = firstNo + secondNo;
			System.out.print(sum + " ");
			firstNo = secondNo;
			secondNo = sum;
			if (sum > a)
			{
				break;
			}
		}
	}

}
