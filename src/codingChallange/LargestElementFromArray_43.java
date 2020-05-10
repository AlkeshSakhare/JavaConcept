package codingChallange;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementFromArray_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		System.out.println("Enter 10 values: ");
		for (int i = 0; i < array.length; i++) {

			array[i] = new Scanner(System.in).nextInt();
		}
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Max no is: " + max);
		int maxNo = Arrays.stream(array).max().getAsInt();
		int minNo = Arrays.stream(array).min().getAsInt();
		int sum = Arrays.stream(array).sum();
		System.out.println("Max by Arrays.steam(array).max().getAsInt():" + maxNo);
		System.out.println("Min by Arrays.steam(array).min().getAsInt():" + minNo);
		System.out.println("sum by Arrays.steam(array).sum():" + sum);

	}

}
