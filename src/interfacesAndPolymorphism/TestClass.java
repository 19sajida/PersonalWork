package interfacesAndPolymorphism;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random();
		ArrayList<Meal> array = new ArrayList<Meal>();
		int min = 1;
		int max = 3;
		int eggs = 0;
		double total = 0;
		for (int counter = 0; counter < 25; counter++) {
			int num = min + numbers.nextInt(max - min + 1);
			if (num == 1) {
				array.add(new Breakfast(true, "Juice", 500));
			}
			if (num == 2) {
				array.add(new Lunch());
			}
			if (num == 3) {
				array.add(new Dinner());
			}
		}
		for (int counter = 0; counter < array.size(); counter++) {
			total = total + array.get(counter).getCalories();
			if (array.get(counter) instanceof Breakfast) {
				eggs++;
			}
			if (array.get(counter) instanceof Lunch) {
				System.out.println(array.get(counter).toString());
			}
			if (array.get(counter) instanceof Dinner) {
				Dinner other = (Dinner) array.get(counter);
				System.out.println(other.forDessert());
			}
		}
		
		System.out.println("Number of breakfasts with eggs: " + eggs);
		System.out.println("Average calories: " + total / 25);
	}
}