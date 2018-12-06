package arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ClassActivities3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);
		ArrayList<String> array = new ArrayList<String>();
		array.add("Bob Smith");
		array.add("Jane Miller");
		array.add(1, "Billy Jones");
		System.out.println("Enter name: ");
		String name = input.nextLine();
		array.add(name);

		for (int counter = 0; counter < array.size(); counter++) {
			System.out.println(array.get(counter));
		}

		ArrayList<Friend> array2 = new ArrayList<Friend>();
		array2.add(new Friend("Bob Smith", 17));
		array2.add(0, new Friend("Jane Miller", 15));
		array2.add(0, new Friend("Billy Jones", 12));

		for (int counter = 0; counter < array2.size(); counter++) {
			System.out.println(array2.get(counter).getAge());
		}
	}

}
