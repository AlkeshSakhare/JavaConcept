package codingChallange;

import java.util.Scanner;

public class CheckArmstrongNo_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no");
		int n = new Scanner(System.in).nextInt();
		int actulno=n;
		int sum = 0;
		int digit;
		while (n > 0) {
			digit = n % 10;
			n = n / 10;
			sum = sum + digit * digit * digit;
		}
		if (sum == actulno)
		{
			System.out.println(actulno + " is an armstrong no");
		}
		else {
			System.out.println(actulno + " is not an armstrong no");
		}
	}


}
