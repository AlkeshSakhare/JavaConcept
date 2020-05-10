package codingChallange;

import java.util.Scanner;

public class TransposeOfMatrix_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of row and column of matrix respectively");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i, j;
		int a[][] = new int[x][y];
		System.out.println("Enter matrix elements: ");
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int transpose[][] = new int[y][x];
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				transpose[j][i] = a[i][j];
				System.out.println("transpose[" + j + "][" + i + "]" + transpose[j][i]);
			}
		}
		System.out.println("Actual matrix is :");
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix is :");
		for (i = 0; i < y; i++) {
			for (j = 0; j < x; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
