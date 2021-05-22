package random;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.1 + 0.2;
		if (a == 0.3)
			a = 3;
		else if (a > 0.3)
			a = 4;
		else if (a < 0.3)
			a = 5;
		System.out.println(a);
	}

}
