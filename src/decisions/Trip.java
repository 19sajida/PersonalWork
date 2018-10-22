package decisions;

import java.util.Scanner;

public class Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people are going on the trip?");
		int people = input.nextInt();
		System.out.println("Do you want to do the museum tour?");
		boolean tour = input.nextBoolean();
		if (tour == true) {
			System.out.println("Do you want to do the zoo adventure?");
			boolean zoo = input.nextBoolean();
			if (zoo == true) {
				System.out.println("Your total cost is $" + people * 275);
			} else {
				System.out.println("Your total cost is $" + people * 240);
			}
		} else {
			System.out.println("Do you want to do the zoo adventure?");
			boolean zoo = input.nextBoolean();
			if (zoo == true) {
				System.out.println("Your total cost is $" + people * 235);
			} else {
				System.out.println("Your total cost is $" + people * 200);
			}
		}
	}
}
