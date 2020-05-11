package codingChallange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMap2List_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> day = new HashMap();
		day.put(1, "Monday");
		day.put(2, "Tuesday");
		day.put(3, "Wednesday");
		day.put(4, "Thursday");
		day.put(5, "Friday");
		day.put(6, "Saturday");
		day.put(7, "Sunday");
		System.out.println("DayMap: " + day);

		@SuppressWarnings("unchecked")
		List<Integer> dayKey = new ArrayList(day.keySet());
		List<String> dayValue = new ArrayList(day.values());

		System.out.println("DayKey: " + dayKey);
		System.out.println("DayValue: " + dayValue);

	}
}
