package codingChallange;

import java.util.Arrays;

public class Concatenate2Arrays_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 6, 7, 8, 9, 10 };
		int result[] = new int[array1.length + array2.length];
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array2.length, array1.length);
		System.out.println("Merging 2 arrays: " + Arrays.toString(result));
	}

}
