package arrays;

import java.util.Scanner;
import java.util.Random;

public class PracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random number = new Random(1);
		/*
		 * final int total = 100; int[] integer = new int[total]; int low = 7; int high
		 * = 852; int counter = 0; double average = 0.0; int counter2 = 0; for (counter
		 * = 0; counter < integer.length; counter++) { int num = low +
		 * number.nextInt(high - low + 1); integer[counter] = num; }
		 * System.out.println("Which number do you want to display?"); int display =
		 * input.nextInt(); do { average = average + integer[display];
		 * System.out.println(integer[display]);
		 * System.out.println("Which number do you want to display? 9999 to quit");
		 * display = input.nextInt();
		 * 
		 * counter2++; } while (display != 9999); double average2 = average / counter2;
		 * System.out.println("Average = " + average2);
		 * 
		 * 
		 * final int total = 3; Friend[] dude = new Friend[total]; for (int counter = 0;
		 * counter < total; counter++) { System.out.println("Enter friend name: ");
		 * String name = input.nextLine(); System.out.println("Enter age: "); int age =
		 * input.nextInt(); input.nextLine(); dude[counter] = new Friend(name, age); }
		 * for (int counter2 = 0; counter2 < total; counter2++) { System.out.println(
		 * "Name: " + dude[total - 1 - counter2].getName() + " Age: " + dude[total - 1 -
		 * counter2].getName());
		 * 
		 * }
		 */
		final int num = 3;
		double total = 0;
		double average = 0;
		String last = "";
		String[] bob = new String[num];
		for (int counter = 0; counter < bob.length; counter++) {
			System.out.println("Enter full name: ");
			bob[counter] = input.nextLine();
			last = bob[counter].substring(bob[counter].indexOf(" ") + 1);
			average = average + last.length();
		}
		total = average / num;
		System.out.println("Average length of last name: " + total);

	}

}
