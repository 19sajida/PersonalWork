package interfacesAndPolymorphism;

import java.util.Scanner;

public class TestClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("Enter length: ");
		int length = input.nextInt();
		System.out.println("Enter width: ");
		int width = input.nextInt();
		Shape one = new Rectangle(length, width);
		System.out.println("Area: " + one.area() + " Perimeter: " + one.perimeter());
	*/
		
		System.out.println("Enter radius: " );
		int radius = input.nextInt();
		Shape two = new Circle(radius);
		System.out.println("Area: " + two.area() + " Perimeter: " + two.perimeter());
	
	}

}
