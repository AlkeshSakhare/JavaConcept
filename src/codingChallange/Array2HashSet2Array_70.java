package codingChallange;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array2HashSet2Array_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		System.out.println("DayArray: " + Arrays.toString(month));

		Set<String> array2Set = new LinkedHashSet<String>(Arrays.asList(month));
		System.out.println("Array 2 Set: " + array2Set);

		String set2Array[] = new String[month.length];
		array2Set.toArray(set2Array);
		System.out.println("Set 2 Array: " + Arrays.toString(set2Array));
	}
}
