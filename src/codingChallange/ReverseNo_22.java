package codingChallange;

import java.util.Scanner;

public class ReverseNo_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		int a = new Scanner(System.in).nextInt();
		String no = String.valueOf(a);
		StringBuffer buffer = new StringBuffer(no);

		System.out.println(buffer.reverse());

	}
}
