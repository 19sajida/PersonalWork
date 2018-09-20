package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int weight = 0;
		System.out.println("Enter your weight:");
		weight = input.nextInt();
		int age = 0;
		System.out.println("Enter your age:");
		age = input.nextInt();
		int number = 0;
		System.out.println("Enter your lucky number:");
		number = input.nextInt();
		System.out.println("In the future...");
		System.out.println("I see...");
		System.out.println(number + " years from now...");
		System.out.println("You will be reside number " + weight + age);
		System.out.println("at the old folks home.");
	}

}
