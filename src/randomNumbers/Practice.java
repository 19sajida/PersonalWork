package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number = new Random(1);
		Scanner input = new Scanner(System.in);
		/*
		 * int high = 0; int low =1; int counter =0; int randNumber=0; int
		 * rolls=0; System.out.println("How many sides on the die?"); high =
		 * input.nextInt(); System.out.println("How many rolls?");
		 * rolls=input.nextInt(); for(counter=1; counter<=rolls; counter++){
		 * randNumber=low+number.nextInt(high-low+1);
		 * System.out.println(randNumber); }
		 * 
		 * 
		 * int high = 6; int low = 1; int counter = 0; int randNumber = 0;
		 * double one = 0; double two = 0; double three = 0; double four = 0;
		 * double five = 0; double six = 0; int rolls = 0; int total=0;
		 * System.out.println("How many times did you roll the die?"); rolls =
		 * input.nextInt(); for (counter = 1; counter <= rolls; counter++) {
		 * randNumber = low + number.nextInt(high - low + 1); if (randNumber ==
		 * 1) { one++; } if (randNumber == 2) { two++; } if (randNumber == 3) {
		 * three++; } if (randNumber == 4) { four++; } if (randNumber == 5) {
		 * five++; } if (randNumber == 6) { six++; } total++; }
		 * System.out.println("Ones: " + one + " Two: " + two + " Three: " +
		 * three + " Four: " + four + " Five: " + five + " Six: " + six);
		 * System.out.println("Percentages: Ones: " + one/total*100 + " Two: " +
		 * two/total*100 + " Three: " + three/total + " Four: " + four/total*100
		 * + " Five: " + five/total*100 + " Six: " + six/total*100);
		 * 
		 * 
		 * int high = 2; int low = 1; int counter = 0; int randNumber = 0;
		 * double heads = 0; double max = 0; double min = 1000000; int counter2
		 * = 0; for (counter = 1; counter <= 1000000; counter++) {
		 * 
		 * for (counter2 = 1; counter2 <= 100000; counter++) {randNumber = low +
		 * number.nextInt(high - low + 1); if (randNumber == 1) { heads++;}}
		 * 
		 * if (heads < max) { max = heads/100000*100;}
		 * 
		 * if (heads > min) { min = heads/100000*100;} heads=0;
		 * 
		 * } System.out.println("Max: " + max + " Min: " + min);
		 */

		int high = 6;
		int low = 1;
		int counter = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		do {
			counter++;
			one = low + number.nextInt(high - low + 1);
			two = low + number.nextInt(high - low + 1);
			if (one == two) {
				three = low + number.nextInt(high - low + 1);
				if (one == three) {
					four = low + number.nextInt(high - low + 1);
					if (one == four) {
						five = low + number.nextInt(high - low + 1);
						if (one==five){
							six=low + number.nextInt(high - low + 1);
						}
					}
				}
			}
		} while (one != six);
		System.out.println("You got Yahtzee! Number of tries: " + counter);
	}

}
