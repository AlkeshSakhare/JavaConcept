package codingChallange;

public class CompareStrings_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String style = "Bold";
		String style2 = "Bold";
		String style3 = new String("Bold");

		if (style == style2) {
			System.out.println("Equal values and objects pointing style==style2");
		}
		if (style == style3) {
			System.out.println("I wont execute");
		} else {
			System.out.println("Equal values but not object pointing style2==style");
		}
		if (style.equals(style2)) {
			System.out.println("It will only check values Using .equals Method: ");
		}
	}

}
