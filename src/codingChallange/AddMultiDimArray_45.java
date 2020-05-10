package codingChallange;

import java.util.Scanner;

public class AddMultiDimArray_45 {
	static Scanner sc = null;
	static int x, y;
	static int a[][], b[][], sum[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter dim of array");
		sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		a = new int[x][y];
		b = new int[x][y];
		sum = new int[x][y];

		System.out.println("Enter first array");
		a = getArray();
		System.out.println("Enter second array");
		b = getArray();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Maxtrix A: ");
		printArray(a);
		System.out.println("Matrix B: ");
		printArray(b);
		System.out.println("a+b: ");
		printArray(sum);

	}

	private static void printArray(int[][] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] getArray() {
		// TODO Auto-generated method stub
		int array[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}

}
