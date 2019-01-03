package designingClasses;

import java.util.Scanner;
import java.util.Random;

public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random();
		int rows = 1;
		int columns = 2;
		int[][] array = new int[rows][columns];
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				System.out.println("Enter height: ");
				int height = input.nextInt();
				array[counter][counter2] = height;
			}
		}
		int total = 0;
		int min = 10000;
		int max = 0;
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				total = total + array[counter][counter2];
				if (max < array[counter][counter2]) {
					max = array[counter][counter2];
				}
				if (min > array[counter][counter2]) {
					min = array[counter][counter2];
				}
			}
		}
		double average = total / (rows * columns);
		System.out.println("Average height: " + average);
		System.out.println("Tallest student: " + max);
		System.out.println("Shortest student: " + min);
	}

}
