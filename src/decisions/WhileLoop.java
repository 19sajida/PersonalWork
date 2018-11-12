package decisions;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("Enter integer:"); int number = input.nextInt();
		 * int cube = 0; while(number != -1){cube=number*number*number;
		 * System.out.println(cube);System.out.println("Enter integer:"); number
		 * = input.nextInt();}
		 * 
		 * 
		 * System.out.println("What is the max value?"); int number =
		 * input.nextInt(); int start =0; while (start<=number){
		 * System.out.println(start);start = start+5;}
		 * 
		 * 
		 * System.out.println("Test Score:"); double score = input.nextDouble();
		 * double largest =0; double smallest=981346.938; while(score!=9999){if
		 * (smallest>score){smallest=score;}if
		 * (largest<score){largest=score;}System.out.println("Test Score:");
		 * score = input.nextDouble();} System.out.println("Largest: " + largest
		 * + "\n Smallest: " + smallest);
		 * 
		 * 
		 * System.out.println("Test Score: (Enter 9999 to quit)"); double score
		 * = input.nextDouble(); double average = 0; double total = 0; double
		 * number = 0; while (score != 9999) { number++; total = total + score;
		 * System.out.println("Test Score: (Enter 9999 to quit)"); score =
		 * input.nextDouble(); } average = total / number;
		 * System.out.println("Sum: " + total + "\n Average: " + average);
		 */

		System.out.println("Four digit number: (Enter 9999 to quit)");
		double number = input.nextDouble();
		double remainder = 0;
		while (number != 9999) {
			remainder = number % 100;
			if (remainder >= 50) {
				number = number-remainder+100;
			} else {
				number = number-remainder;
			}
			System.out.println(number);
			System.out.println("Four digit number: (Enter 9999 to quit)");
			number = input.nextDouble();
		}
	}

}
