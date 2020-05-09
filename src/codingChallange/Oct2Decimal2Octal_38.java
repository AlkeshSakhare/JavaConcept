package codingChallange;

import java.util.Scanner;

public class Oct2Decimal2Octal_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter decimal no");
		int no = new Scanner(System.in).nextInt();
		int acutalNo = no;
		int octalNo=octal(acutalNo);
		System.out.println("Octal No: " + Integer.toOctalString(acutalNo));
		System.out.println("Decimal No:" + Integer.parseInt(octalNo + "", 8));
		System.out.println("(" + acutalNo + ")8 = " + octalNo);
		System.out.println("(" + octalNo + ")2 =" + decimal(octalNo));
	}

	private static int octal(int no) {
		// TODO Auto-generated method stub
		String octal = "";
		while (no != 0) {
			octal = octal + no % 8;
			no = no / 8;
		}
		octal = new StringBuffer(octal).reverse().toString();
		return Integer.parseInt(octal);
	}

	private static int decimal(int no) {
		int count = 0;
		int sum = 0;
		while (no != 0) {
			int digit = no % 10;
			sum += digit * Math.pow(8, count);
			count++;
			no = no / 10;
		}
		return sum;
	}
}
