package decisions;

import java.util.Scanner;
import java.util.Random;

public class PracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		/*
		 * int random = bob.nextInt(1000);
		 * System.out.println("Enter an integer from 0-1000"); int number =
		 * input.nextInt(); int guesses = 1; while (number != random) { if
		 * (number > random) { guesses++;
		 * System.out.println("Guess a lower number"); number = input.nextInt();
		 * } else { guesses++; System.out.println("Guess a higher number");
		 * number = input.nextInt(); } } System.out.println("Nice job! It took "
		 * + guesses + " to guess " + random);
		 * 
		 * 
		 * double wins = 0; double total = 0; int random = 0; boolean game =
		 * true; double average = 0; int guess = 0; do { random =
		 * bob.nextInt(2); if (random == 0) { random = 3; }
		 * 
		 * System.out.println("Guess the cup with the ball under it (cups 1-3)"
		 * ); guess = input.nextInt(); if (guess == random) {
		 * System.out.println("You won the game!"); total++; wins++; } else {
		 * System.out.println("You lost the game!"); total++; }
		 * System.out.println("Do you want to play again?"); game =
		 * input.nextBoolean(); } while (game == true); average = wins / total
		 * *100; System.out.println("Your winning average is: " + average +
		 * "%");
		 */

		System.out.println("Enter a 3 digit positive integer: ");
		int number = input.nextInt();
		if (number % 2 != 0) {
			number = number + 1;
		}
		int counter = 0;
		int sum = 0;
		for (counter = number; counter <= 1000; counter = counter + 2) {
			sum = sum + counter;
		}
		System.out.println(sum);

	}

}
