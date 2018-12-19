package designingClasses;

import java.util.Scanner;

import arrays.Rectangle;

import java.util.Random;
import java.util.ArrayList;

public class ClassActivities3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(10);
		/*
		 * ArrayList<Double> array = new ArrayList<Double>(); int max= 499; int min=0;
		 * for (int counter = 0; counter<1000; counter++) { double num = min +
		 * numbers.nextInt(max-min+1); array.add(num); }
		 * System.out.println("Enter number: "); double value = input.nextDouble(); int
		 * count =0; for (int counter2 = 0; counter2<array.size(); counter2++) { if
		 * (array.get(counter2).equals(value)) {count++;
		 * 
		 * } } System.out.println("Number appears " + count + " times.");
		 */

		ArrayList<Rectangle> array = new ArrayList<Rectangle>();
		int length = 0;
		int width = 0;
		int min = 0;
		int max = 499;
		int count = 0;
		for (int counter = 0; counter < 100; counter++) {
			length = min + numbers.nextInt(max - min + 1);
			width = min + numbers.nextInt(max - min + 1);
			array.add(new Rectangle(length, width));
		}
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			if (array.get(counter2).getWidth() == 10) {
				count++;
			}
		}
		System.out.println("Number of rectangles with width of 10: " + count);
	}

}
