package designingClasses;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numbers = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<Phone> array = new ArrayList<Phone>();
		for (int counter = 0; counter < 2; counter++) {
			System.out.println("Enter phone number: ");
			int number = input.nextInt();
			System.out.println("Enter minutes used: ");
			int minutes = input.nextInt();
			array.add(new Phone(number, minutes));
		}
		int min = 0;
		int max = 10;
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			for (int counter3 = 0; counter3 < 300; counter3++) {
				int mins = min + numbers.nextInt(max - min + 1);
				array.get(counter2).makeCall(mins);
			}
		}
		System.out.println(array.get(array.size()-1).clone().toString());
	}

}
