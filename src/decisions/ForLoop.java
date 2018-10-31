package decisions;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * int counter = 1; for (counter=1; counter <=5; counter =
		 * counter+1){System.out.println(counter);}
		 * 
		 * int counter = 0; for (counter = 1; counter <= 10; counter++) {
		 * System.out.println(counter + " Hello"); }
		 * 
		 * int counter = 0; for (counter = 15; counter <= 60; counter= counter
		 * +5) { System.out.println(counter + " Hello");} int counter = 0; for
		 * (counter = 10; counter >=1; counter=counter-1) {
		 * System.out.println(counter + " Hello"); }
		 * System.out.println("How many Hello's would you like?"); int number =
		 * input.nextInt(); int counter =0; for (counter = 1; counter <= number;
		 * counter++) { System.out.println(counter + " Hello");}
		 * System.out.println("What is your favorite number?"); int number =
		 * input.nextInt(); int counter =0; for (counter = 1; counter <= 10;
		 * counter++) { System.out.println(number + " Hello");}
		 * 
		 * int counter = 0; int sum = 0; for (counter = 1; counter <= 10;
		 * counter++) { sum = sum + counter; } System.out.println("Sum: " +
		 * sum); }
		 * 
		 * int counter = 0; int number = 0; int sum = 0; for (counter = 1;
		 * counter <= 5; counter++) { System.out.println("Enter number:");
		 * number = input.nextInt(); sum = number + sum; }
		 * System.out.println("The sum of the numbers is: " + sum);
		 * 
		 * 
		 * int counter = 0; int sum =0;
		 * System.out.println("Enter positive integer: "); int number =
		 * input.nextInt(); for(counter=1; counter<=number; counter = counter
		 * +2){sum = counter+sum;} System.out.println(sum);
		 * 
		 * 
		 * double number = 0; double score = 0; double total = 0; double average
		 * = 0; double counter = 0;
		 * System.out.println("How many students took the test?"); number =
		 * input.nextDouble(); for (counter = 1; counter <= number; counter++) {
		 * System.out.println("Score: "); score = input.nextDouble(); total =
		 * total + score; } average = total / number;
		 * System.out.println("Average score:" + average);
		 * 
		 * 
		 * System.out.println("Enter positive integer: "); int number =
		 * input.nextInt(); int counter = 0; int factorial =1;
		 * for(counter=number; counter>0;
		 * counter=counter-1){factorial=counter*factorial;}
		 * System.out.println("Factorial: " + factorial);
		 * 
		 * 
		 * double number = 0; double cost =0; double sum =0; double tax =0;
		 * double total=0; double counter =0;
		 * System.out.println("How many items are there?"); number =
		 * input.nextDouble(); for (counter=1; counter<=number; counter++)
		 * {System.out.println("Price of item: "); cost = input.nextDouble();
		 * sum = sum+cost;} System.out.println("Total cost of items: " + sum);
		 * tax = .05*sum; System.out.println("Total cost of tax: " + tax); total
		 * = tax+sum; System.out.println("Total cost of items including tax: " +
		 * total);
		 * 
		 * 
		 * 
		 * int number =0; int counter=0; int divisors =0;
		 * System.out.println("Enter a positive integer: "); number =
		 * input.nextInt(); for(counter =1; counter <= number; counter++){if
		 * (number%counter==0){divisors++;} }
		 * System.out.println("Number of divisors: " + divisors);
		 

		int number = 0;
		int counter = 0;
		int largest = 0;
		System.out.println("Enter a positive integer: ");
		number = input.nextInt();
		for (counter = 1; counter < number; counter++) {
			if (number % counter == 0) {
				largest = counter;
			}

		}
		System.out.println("Largest factor = " + largest);
		*/
		
		int number = 0;
		int counter =0;
		int divisor=0;
		System.out.println("Enter positive integer:");
		number = input.nextInt();
		for(counter=1; counter < number; counter++){if (counter%number==0){divisor++;}}
		if (divisor <= 2){System.out.println("It is a prime number");}
		else{System.out.println("It is not a prime number");
		}
	}
}
