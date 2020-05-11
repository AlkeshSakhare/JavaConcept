package codingChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList2Array_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		System.out.println("ArrayList: " + days);

		System.out.println("Converting to arrays:");
		Object[] a = days.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		List<Object> day = Arrays.asList(a);
		System.out.println("Converting to ArrayList: " + day);

	}

}
