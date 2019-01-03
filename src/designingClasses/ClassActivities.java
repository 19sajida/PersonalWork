package designingClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many greeters do you want to contructs?");
		int number = input.nextInt();
		ArrayList<Greeter> array = new ArrayList<Greeter>();
		for (int counter = 0; counter < number; counter++) {
			array.add(new Greeter());
		}
		for (Greeter counter2 : array) {
			System.out.println(counter2.getName());
		}
	}

}
