package arrays;

import java.util.Scanner;
import java.util.Random;

public class ProgrammingOpportunities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random number = new Random();
		/*
		 * final int total = 2; String [] bob = new String[total]; for (int counter=0;
		 * counter<total; counter++) {
		 * System.out.println("Enter social securtity number in ***-**-**** format: ");
		 * String number = input.nextLine(); bob[counter] = number.substring(7); } for
		 * (int counter2=0; counter2<total; counter2++) {
		 * System.out.println(bob[counter2]); }
		 * 
		 * 
		 * int low = 1; int high = 100; int counter4 = 0; int noom = 0; final int total
		 * = 10000; int[] bob = new int[total]; for (int counter = 0; counter < total;
		 * counter++) { bob[counter] = low + number.nextInt(high - low + 1);
		 * 
		 * } System.out.println("Enter number 1-100: (Enter 9999 to stop)"); noom =
		 * input.nextInt(); do { for (int counter3 = 0; counter3 < total; counter3++) {
		 * if (bob[counter3] == noom) { counter4++; } }
		 * System.out.println("That number occurs " + counter4 + " times.");
		 * System.out.println("Enter number 1-100: (Enter 9999 to stop)"); noom =
		 * input.nextInt(); } while (noom != 9999);
		 */

		System.out.println("How many friends do you have?");
		int friends = input.nextInt();
		int length = 0;
		int total = 0;
		String name = "";
		int age = 0;
		Friend[] bob = new Friend[friends];
		for (int counter = 0; counter < friends; counter++) {
			input.nextLine();
			System.out.println("What is the name of your friend?");
			name = input.nextLine();
			System.out.println("What is the age of your friend?");
			age = input.nextInt();
			bob[counter] = new Friend(name, age);
			length = bob[counter].getName().length();
			total = length + total;
		}
		double average = total / friends;
		System.out.println("Average name length: " + average);
	}

}
