package codingChallange;

import java.util.Scanner;

public class Binary2Oct2Binary_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Binary no");
		@SuppressWarnings("resource")
		int no = new Scanner(System.in).nextInt();

		int decimal = Integer.parseInt(no + "", 2);
		String oct = Integer.toOctalString(decimal);
		String binary = Integer.toBinaryString(Integer.parseInt(oct + "", 8));

		// System.out.println("(" + no + ")2 = " + binary);
		System.out.println("(" + no + ")2 = (" + oct + ")8");
		System.out.println("(" + oct + ")8 = (" + binary + ")2");

	}

}
