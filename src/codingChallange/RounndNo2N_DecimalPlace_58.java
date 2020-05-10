package codingChallange;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RounndNo2N_DecimalPlace_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 1.34567;
		System.out.println("Actual No: " + num);
		System.out.println("Method 1");
		System.out.format("%.3f", num);
		System.out.println();
		System.out.println("Method 2");
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println(df.format(num));
	}

}
