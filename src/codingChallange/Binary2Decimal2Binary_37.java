package codingChallange;

import java.util.Scanner;

public class Binary2Decimal2Binary_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter decimal no");
		@SuppressWarnings("resource")
		int no = new Scanner(System.in).nextInt();
		int actualNo = no;
		int binary = binary(no);
		System.out.println(actualNo + " = (" + binary + ")2");
		System.out.println("(" + binary + ")2 =" + decimal(binary));
		System.out.println("Integer.toBinaryString(" + no + "): " + Integer.toBinaryString(no));
		System.out.println("Integer.parseInt(" + binary + ", 2): " + Integer.parseInt(binary + "", 2));
	}

	private static int binary(int no) {
		// TODO Auto-generated method stub
		String binary = "";
		while (no != 0) {
			if (no % 2 == 1) {
				binary = binary + 1;
			} else {
				binary = binary + 0;
			}
			no = no / 2;
		}
		binary = new StringBuffer(binary).reverse().toString();
		return Integer.parseInt(binary);
	}

	private static int decimal(int no) {
		int count = 0;
		int sum = 0;
		while (no != 0) {
			int digit = no % 10;
			sum += digit * Math.pow(2, count);
			count++;
			no = no / 10;
		}
		return sum;
	}
}
