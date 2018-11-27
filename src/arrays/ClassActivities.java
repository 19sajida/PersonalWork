package arrays;

import java.util.Scanner;

public class ClassActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * int [] testscores = new int [5]; for (int counter=0; counter <
		 * testscores.length; counter++){ System.out.println("Give a score:");
		 * testscores [counter] = input.nextInt(); } int sum = 0; for (int
		 * counter=0; counter < testscores.length; counter++){ sum = sum +
		 * testscores [counter]; } System.out.println("Sum: " + sum);
		 

		String[] names = new String[20];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter name:");
			names[counter] = input.nextLine();
		}
		for (int counter2 = 1; counter2 <= names.length; counter2++) {
			System.out.println(names[names.length - counter2]);
		}
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		for (int counter3 = 0; counter3 < names.length; counter3++) {
			if (names[counter3].charAt(names[counter3].length() - 1) == letter.charAt(0)) {
				System.out.println(names[counter3]);
			}
		}
		*/
		
		String[] names = new String[3];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter name:");
			names[counter] = input.nextLine();

		}
		System.out.println("Enter a length: ");
		int letter = input.nextInt();
		int number=0;
		for (int counter3 = 0; counter3 < names.length; counter3++) {
			if (names[counter3].length() == letter) {
				number++;}
			}
		System.out.println("Number of friends with that many letters:" + number);
	}

}
