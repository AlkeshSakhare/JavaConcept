package codingChallange;

import java.util.Scanner;

public class CalculateAvgUsingArray_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		System.out.println("Enter 10 values: ");
		for (int i = 0; i < array.length; i++) {

			array[i] = new Scanner(System.in).nextInt();
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

		}
		System.out.print("Array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAvg is :" + sum / 10);
	}

}
