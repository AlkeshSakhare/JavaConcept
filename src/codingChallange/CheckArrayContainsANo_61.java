package codingChallange;

import java.util.Arrays;

public class CheckArrayContainsANo_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5, 6, 5, 8, 9, 0 };

		int no = 5;
		int position = Arrays.binarySearch(array, no);
		if (position > -1) {
			System.out.println(no + " is present in " + Arrays.toString(array) + " at " + position + " position ");
		} else {
			System.out.println(no + " is absent in " + Arrays.toString(array));
		}
	}

}
