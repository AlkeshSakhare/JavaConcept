package codingChallange;

import java.util.Scanner;

public class RootsOFQuadEq_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 nos as coefficient of quadratic equation as ax^2+bx+c=0");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double alpha, beta;
		double sqPart = (b * b) - (4 * a * c);

		if (sqPart>0)
		{
			alpha = (-b + Math.sqrt(sqPart)) / (2 * a);
			beta = (-b - Math.sqrt(sqPart)) / (2 * a);
			System.out.println("Roots are real");
			System.out.println("Root1 are  Alpha: " + alpha);
			System.out.println("Root2 are  Beta: " + beta);

		}
		else {
			sqPart = -sqPart;
			alpha = (-b + Math.sqrt(sqPart)) / (2 * a);
			beta = (-b - Math.sqrt(sqPart)) / (2 * a);
			System.out.println("Roots are imaginary");
			System.out.println("Root1 are  Alpha: " + alpha + "i");
			System.out.println("Root2 are  Beta: " + beta + "i");

		}
	}

}
