package strings;

import java.util.Scanner;

public class EssayTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay bob = new Essay();
		System.out.println("Enter first and last name:");
		String name = input.nextLine();
		System.out.println("Type essay:");
		String essay = input.nextLine();
		bob.setName(name);
		bob.setText(essay);
		System.out.println("Last name in all caps: " + bob.lastName());
		System.out.println("Number of letters in first name: " + bob.firstName());
		System.out.println("Does the name have an x? " + bob.x());
		System.out.println("Word count: " + bob.words());
	}

}
