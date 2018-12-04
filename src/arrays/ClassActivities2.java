package arrays;

import java.util.Scanner;
import java.util.Random;

public class ClassActivities2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		/*
		 * int max = 100; int min = 0; System.out.println("Enter rows: "); int
		 * row = input.nextInt(); System.out.println("Enter columns: "); int
		 * column = input.nextInt(); int[][] array = new int[row][column]; for
		 * (int counter = 0; counter < row; counter++) { for (int counter2 = 0;
		 * counter2 < column; counter2++) { array[counter][counter2] = min +
		 * numbers.nextInt(max - min + 1);
		 * System.out.print(array[counter][counter2] + " "); }
		 * System.out.println(); } int total = 0; int r = 0; int c = 0; int[][]
		 * array2 = new int[row][column]; for (int counter = 0; counter < row;
		 * counter++) { for (int counter2 = 0; counter2 < column; counter2++) {
		 * array2[counter][counter2] = min + numbers.nextInt(max - min + 1); c =
		 * c + array2[counter][counter2];
		 * System.out.print(array2[counter][counter2] + " "); }
		 * System.out.println(); } System.out.println(c);
		 * 
		 * 
		 * int max = 50; int min = 0; int row = 3; int column = 7; int third =
		 * 8; int sum = 0; int[][][] array2 = new int[row][column][third]; for
		 * (int counter = 0; counter < row; counter++) { for (int counter2 = 0;
		 * counter2 < column; counter2++) { for (int counter3 = 0; counter3 <
		 * third; counter3++) { array2[counter][counter2][counter3] = min +
		 * numbers.nextInt(max - min + 1); sum = sum +
		 * array2[counter][counter2][counter3]; } }
		 * 
		 * } System.out.println("Sum: " + sum);
		 * 
		 */
		int max = 100;
		int min = 0;
		int rows = 18;
		int columns = 5;
		Friend[][] array = new Friend[rows][columns];
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				System.out.println("Enter name: ");
				String name = input.nextLine();
				int age = min + numbers.nextInt(max - min + 1);
				array[counter][counter2] = new Friend(name, age);

			}

		}
		for (int counter3 = 0; counter3 < rows; counter3++) {
			for (int counter4 = 0; counter4 < columns; counter4++) {
				System.out.print(array[counter3][counter4].getAge() + " ");
			}
			System.out.println();
		}
	}
}
