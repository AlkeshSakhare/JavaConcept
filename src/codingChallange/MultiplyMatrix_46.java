package codingChallange;

import java.util.Scanner;

public class MultiplyMatrix_46 {

	static Scanner sc = null;
	static int x;
	static int a[][], b[][], sum[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter order of matrix");
		sc = new Scanner(System.in);
		x = sc.nextInt();

		a = new int[x][x];
		b = new int[x][x];
		sum = new int[x][x];

		System.out.println("Enter first array");
		a = getArray();
		System.out.println("Enter second array");
		b = getArray();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < x; k++) {
					sum[i][j] = sum[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Maxtrix A: ");
		printArray(a);
		System.out.println("Matrix B: ");
		printArray(b);
		System.out.println("a x b: ");
		printArray(sum);

	}

	private static void printArray(int[][] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] getArray() {
		// TODO Auto-generated method stub
		int array[][] = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}
}
