package arrays;

import java.util.Scanner;
import java.util.Random;

public class PracticeAssessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		System.out.println("How many students are there?");
		int num = input.nextInt();
		input.nextLine();
		double total = 0;
		String[][] array = new String[num][2];
		for (int counter = 0; counter < num; counter++) {
			System.out.println("Enter name: ");
			String names = input.nextLine();
			String first = names.substring(0, names.indexOf(" ") - 1);
			String last = names.substring(names.indexOf(" ") + 1);
			array[counter][1] = first;
			array[counter][2] = last;
			total = total + array[counter][1].length();
		}
		double average = total / num;
		for (int counter2 = 0; counter2 < num; counter2++) {
			System.out.println(array[counter2][2] + ", " + array[counter2][1]);
		}
	}

}
