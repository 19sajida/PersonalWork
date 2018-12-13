package arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class PracticeAssessment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);
		ArrayList<Friend> array = new ArrayList<Friend>();
		for (int counter = 0; counter < 2; counter++) {
			System.out.println("Enter friend name: ");
			String name = input.nextLine();
			System.out.println("Enter age: ");
			int age = input.nextInt();
			array.add(new Friend(name, age));
			input.nextLine();
		}
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			System.out.println(array.get(array.size() - 1 - counter2).getName());
			System.out.println("years util they can retire: " + (65 - array.get(array.size() - 1 - counter2).getAge()));
		}
	}

}
