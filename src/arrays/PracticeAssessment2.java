package arrays;

import java.util.Scanner;
import java.util.Random;

public class PracticeAssessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		/*
		 * System.out.println("How many students are there?"); int num =
		 * input.nextInt(); input.nextLine(); double total = 0; String[][] array = new
		 * String[num][2]; for (int counter = 0; counter < num; counter++) {
		 * System.out.println("Enter name: "); String names = input.nextLine(); String
		 * first = names.substring(0, names.indexOf(" ") - 1); String last =
		 * names.substring(names.indexOf(" ") + 1); array[counter][1] = first;
		 * array[counter][2] = last; total = total + array[counter][1].length(); }
		 * double average = total / num; for (int counter2 = 0; counter2 < num;
		 * counter2++) { System.out.println(array[counter2][2] + ", " +
		 * array[counter2][1]); }
		 * 
		 * 
		 * int rows = 1341; int columns = 3; double total = 0; Friend[][] array = new
		 * Friend[rows][columns]; for (int counter = 0; counter < rows; counter++) { for
		 * (int counter2 = 0; counter2 < columns; counter2++) {
		 * System.out.println("Enter name of friend:"); String name = input.nextLine();
		 * System.out.println("Enter age of friend:"); int age = input.nextInt();
		 * input.nextLine(); array[counter][counter2] = new Friend(name, age); total =
		 * total + array[counter][counter2].getName().length(); } } for (int counter3 =
		 * 0; counter3 < rows; counter3++) { for (int counter4 = 0; counter4 < columns;
		 * counter4++) { System.out.print(array[counter3][counter4].getAge() + " "); }
		 * System.out.println(); } System.out.println("Average name length: " + total /
		 * (rows * columns));
		 */

		int columns = 18;
		int rows = 13;
		int min = 1;
		int max = 7;
		int one = 0;
		int best = 9298;
		int[][] array = new int[rows][columns];
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				array[counter][counter2] = min + numbers.nextInt(max - min + 1);
				if (array[counter][counter2] == 1) {
					one++;
				}
				if (array[counter][counter2] < best) {
					best = array[counter][counter2];
				}

			}
		}
		System.out.println("Holes in one: " + one + "\nBest score: " + best);
	}

}
