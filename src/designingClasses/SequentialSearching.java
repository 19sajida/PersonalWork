package designingClasses;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class SequentialSearching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		/*
		 * int min = 0; int max = 10; boolean count = false;
		 * System.out.println("Enter number: (enter -1 to quit)"); int number =
		 * input.nextInt(); do { ArrayList<Integer> array = new
		 * ArrayList<Integer>(); for (int counter = 0; counter < 100; counter++)
		 * { int num = min + numbers.nextInt(max - min + 1); array.add(num); }
		 * 
		 * for (int counter2 = 0; counter2 < array.size(); counter2++) { if
		 * (array.get(counter2) == number) { count = true; } }
		 * System.out.println("Is the number in the array?" + count);
		 * System.out.println("Enter number: (enter -1 to quit)"); number =
		 * input.nextInt(); } while (number != -1);
		 */
		ArrayList<Book> array = new ArrayList<Book>();
		boolean loop = true;
		do {
			System.out.println("Name of book: ");
			String name = input.nextLine();
			System.out.println("Pages in book: ");
			int pages = input.nextInt();
			input.nextLine();
			array.add(new Book(name, pages));
			System.out.println("Do you want to add another book?");
			loop = input.nextBoolean();
			input.nextLine();
		} while (loop != false);
		System.out.println("Name of book: ");
		String name = input.nextLine();
		System.out.println("Pages in book: ");
		int pages = input.nextInt();
		Book second = new Book(name, pages);
		int one = 0;
		boolean two = false;
		boolean three = false;
		for (int counter = 0; counter < array.size(); counter++) {
			if (array.get(counter).getPages() == pages) {
				one++;
			}
		}
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			if (array.get(counter2).getTitle().length() == name.length()) {
				two = true;
			}
		}
		for (int counter3 = 0; counter3 < array.size(); counter3++) {
			if (array.get(counter3).equals(second)) {
				three = true;
			}
		}
		if (three == true) {
			System.out.println("The book is in the Arraylist.");
		} else {
			System.out.println("The book is not in the ArrayList.");
		}
		System.out.println("Is there a book with the same length? " + two);
		System.out.println("How many books have the same number of pages? " + one);

	}
}
