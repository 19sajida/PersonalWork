package designingClasses;

import java.util.Scanner;

public class PileOJunkTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PileOJunk bob = new PileOJunk();
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want an ID number?");
		boolean answer = input.nextBoolean();
		if (answer == true) {
			System.out.println("Your ID number is: " + bob.getNumber());
		}
		System.out.println("Enter an integer: ");
		int one = input.nextInt();
		System.out.println("Enter an integer: ");
		int two = input.nextInt();
		System.out.println(bob.sum(one, two));
		System.out.println("Enter a number to replace the random number: ");
		int three = input.nextInt();
		bob.overwrite(three);

	}

}
