package objectOrientedProgramming;

import java.util.Scanner;

public class Room {
	public Room() {
	}

	public void area() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall in feet?");
		double length = 0.0;
		length = input.nextDouble();
		System.out.println("What is the height of the wall in feet?");
		double height = 0;
		height = input.nextDouble();
		double area = height * length;
		System.out.println("The area of the wall is " + area + " feet sq.");
	}

	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall in feet?");
		double length = 0.0;
		length = input.nextDouble();
		System.out.println("What is the height of the wall in feet?");
		double height = 0;
		height = input.nextDouble();
		double length2 = 0;
		double height2 = 0;
		System.out.println("What is the length of the door in feet?");
		length2 = input.nextDouble();
		System.out.println("What is the height of the door in feet?");
		height2 = input.nextDouble();
		double area = (height * length) - (height2 * length2);
		System.out.println("The area of the wall without the door is " + area + " feet sq.");
	}
}
