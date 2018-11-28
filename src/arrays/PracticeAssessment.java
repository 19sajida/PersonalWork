package arrays;

import java.util.Scanner;
import java.util.Random;

public class PracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random number = new Random(1);
		final int total = 100;
		int[] integer = new int[total];
		int low = 7;
		int high = 852;
		int counter = 0;
		double average = 0.0;
		int counter2 = 0;
		for (counter = 0; counter < integer.length; counter++) {
			int num = low + number.nextInt(high - low + 1);
			integer[counter] = num;
		}
		System.out.println("Which number do you want to display?");
		int display = input.nextInt();
		do {average = average + display;
			System.out.println(integer[display]);
			System.out.println("Which number do you want to display? 9999 to quit");
			display = input.nextInt();
			
			counter2++;
		} while (display != 9999);
		double average2 = average / counter2;
		System.out.println("Average = " + average2);
	}

}
