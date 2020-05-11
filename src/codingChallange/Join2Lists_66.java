package codingChallange;

import java.util.ArrayList;
import java.util.List;

public class Join2Lists_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> weekdays = new ArrayList();
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		System.out.println("weekdays: " + weekdays.toString());
		List<String> weekend = new ArrayList();
		weekend.add("Saturday");
		weekend.add("Sunday");
		System.out.println("weekend: " + weekend.toString());

		List<String> days = new ArrayList();
		days.addAll(weekdays);
		System.out.println("days: " + days.toString());

		days.addAll(weekend);
		System.out.println("days: " + days.toString());

	}

}
