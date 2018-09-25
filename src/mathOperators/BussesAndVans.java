package mathOperators;

import java.util.Scanner;

public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 0;
		int busses = 0;
		int vans = 0;
		System.out.println("How many people do you have?");
		people = input.nextInt();
		busses = (people / 35);
		vans = (people % 35);
		System.out.println("Number of people: " + people
				+ " Number of busses: " + busses
				+ " Number of people left (in vans) = " + vans);

	}

}
