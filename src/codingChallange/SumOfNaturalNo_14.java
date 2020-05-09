package codingChallange;

import java.util.Scanner;

public class SumOfNaturalNo_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter integer");
		int a = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i=1;i<=a;i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of " + a + " natural nos: " + sum);
	}

}
