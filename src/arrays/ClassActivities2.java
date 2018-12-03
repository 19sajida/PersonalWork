package arrays;

import java.util.Scanner;
import java.util.Random;

public class ClassActivities2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random();

		int max = 100;
		int min = 0;
		System.out.println("Enter rows: ");
		int row = input.nextInt();
		System.out.println("Enter columns: ");
		int column = input.nextInt();
		int[][] array = new int[row][column];
		for (int counter = 0; counter < row; counter++) {
			for (int counter2 = 0; counter2 < column; counter2++) {
				array[counter][counter2] = min + numbers.nextInt(max - min + 1);
				System.out.print(array[counter][counter2] + " ");
			}
			System.out.println();
		}
		int total = 0;
		int r = 0;
		int c = 0;
		int[][] array2 = new int[row][column];
		for (int counter = 0; counter < row; counter++) {
			for (int counter2 = 0; counter2 < column; counter2++) {
				array2[counter][counter2] = min + numbers.nextInt(max - min + 1);
				c = c + array2[counter][counter2];
				System.out.print(array2[counter][counter2] + " ");
			}
			System.out.println();
		}
		System.out.println(c);
	}

}
