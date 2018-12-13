package arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ClassActivities4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		/*
		 * System.out.println("How many students in the class?"); int students =
		 * input.nextInt(); int age = 0; ArrayList<Integer> array = new
		 * ArrayList<Integer>(); for (int counter = 0; counter < students;
		 * counter++) { System.out.println("Enter age:"); age = input.nextInt();
		 * array.add(age); } double total = 0; for (int counter2 : array) {
		 * total = total + counter2; } double average = total / students;
		 * System.out.println("Average age: " + average);
		 * 
		 * System.out.println("How many employess?"); int employees =
		 * input.nextInt(); double wage = 0; double highest =0;
		 * 
		 * ArrayList<Double> array = new ArrayList<Double>(); for (int counter =
		 * 0; counter < employees; counter++) {
		 * System.out.println("Enter wage:"); wage = input.nextDouble();
		 * array.add(wage); if (array.get(counter)>highest){ highest =
		 * array.get(counter); } } System.out.println("Highest wage: " +
		 * highest);
		 */

		ArrayList<Circle> array = new ArrayList<Circle>();
		for (int counter = 0; counter < 10; counter++) {
			System.out.println("Enter radius: ");
			int radius = input.nextInt();
			array.add(new Circle(radius));
		}
		for (Circle counter2 : array) {
			System.out.println("Area: " + counter2.area());
		}
	}
}
