package codingChallange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValues_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> day = new LinkedHashMap();
		day.put(1, "Monday");
		day.put(2, "Tuesday");
		day.put(3, "Wednesday");
		day.put(4, "Thursday");
		day.put(5, "Friday");
		day.put(6, "Saturday");
		day.put(7, "Sunday");
		System.out.println("Before sorting:" + day);
		List<Integer> mapKeys = new ArrayList<>(day.keySet());
		List<String> mapValues = new ArrayList<>(day.values());
		Collections.sort(mapValues);

		day = new LinkedHashMap<>();

		for (int i = 0; i < mapKeys.size(); i++) {
			day.put(mapKeys.get(i), mapValues.get(i));
		}
		System.out.println("After sorting:" + day);

	}

}
