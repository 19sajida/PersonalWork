package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What was your score on the first test out of 100");
		double one = input.nextDouble();
		System.out.println("What was your score on the second test out of 100");
		double two = input.nextDouble();
		System.out.println("What was your score on the third test out of 100");
		double three = input.nextDouble();
		System.out.println("Did you do extra credit?");
		boolean extra = input.nextBoolean();
		double total = one + two + three;
		if (extra == true) {
			System.out.println("How many points did you earn?");
			int points = input.nextInt();
			total = total + points;
		}
		double average = total / 300 *100;
		System.out.println("Your average score is: " + average + " %");
	}
}
