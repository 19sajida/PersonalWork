package decisions;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * int counter = 1; for (counter=1; counter <=5; counter =
		 * counter+1){System.out.println(counter);}
		 
		int counter = 0;
		for (counter = 1; counter <= 10; counter++) {
			System.out.println(counter + " Hello");
		}
		
		int counter = 0;
		for (counter = 15; counter <= 60; counter= counter +5) {
			System.out.println(counter + " Hello");} 
		int counter = 0;
		for (counter = 10; counter >=1; counter=counter-1) {
			System.out.println(counter + " Hello");	}
		System.out.println("How many Hello's would you like?");
		int number = input.nextInt();
		int counter =0;
		for (counter = 1; counter <= number; counter++) {
			System.out.println(counter + " Hello");}*/
		System.out.println("What is your favorite number?");
		int number = input.nextInt();
		int counter =0;
		for (counter = 1; counter <= 10; counter++) {
			System.out.println(number + " Hello");}
	}
}
