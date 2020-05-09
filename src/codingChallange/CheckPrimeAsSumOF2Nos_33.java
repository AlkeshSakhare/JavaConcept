package codingChallange;

import java.util.Scanner;

public class CheckPrimeAsSumOF2Nos_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		int no = new Scanner(System.in).nextInt();
		int firstNo, secondNo;
		boolean yes = false;
		for (int i = 2; i < no / 2; i++)
		{
			firstNo = i;
			secondNo = no - i;
			if(isPrime(firstNo) && isPrime(secondNo))
			{
				System.out.println(no + " can be represent as  sum of 2 prime no as =" + firstNo + " + " + secondNo);
				yes = true;
			}
		}
		if (!yes) {
			System.out.println("No can't be represent as sum of 2 prime no");
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
