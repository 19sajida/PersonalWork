package interfacesAndPolymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class TestClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Enter length: "); int length = input.nextInt();
		 * System.out.println("Enter width: "); int width = input.nextInt();
		 * Shape one = new Rectangle(length, width); System.out.println("Area: "
		 * + one.area() + " Perimeter: " + one.perimeter());
		 * 
		 * 
		 * System.out.println("Enter radius: " ); int radius = input.nextInt();
		 * Shape two = new Circle(radius); System.out.println("Area: " +
		 * two.area() + " Perimeter: " + two.perimeter());
		 * 
		 * Rectangle bob = new Rectangle(1,1); Rectangle bob2 = new
		 * Rectangle(2,2); Rectangle bob3 = new Rectangle(3,3); Circle bob4 =
		 * new Circle(1); Circle bob5 = new Circle(2); Circle bob6 = new
		 * Circle(3); ArrayList<Shape> array = new ArrayList<Shape>();
		 * array.add(bob); array.add(bob2); array.add(bob3); array.add(bob4);
		 * array.add(bob5); array.add(bob6); double total=0; double small=19237;
		 * for (int counter=0; counter<array.size(); counter++){ total = total +
		 * array.get(counter).area(); if (small>array.get(counter).perimeter()){
		 * small=array.get(counter).perimeter(); } }
		 * System.out.println("Area total: " + total + " Smallest perimeter: " +
		 * small);
		 */

		Student bob = new Student();
		Student bob2 = new Student();
		Student bob3 = new Student();
		Teacher bob4 = new Teacher();
		Teacher bob5 = new Teacher();
		Teacher bob6 = new Teacher();
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(bob);
		array.add(bob2);
		array.add(bob3);
		array.add(bob4);
		array.add(bob5);
		array.add(bob6);
		bob.setName("bob");
		bob2.setName("bob2");
		bob3.setName("bob3");
		bob4.setName("bob4");
		bob5.setName("bob5");
		bob6.setName("bob6666666");
		for (int counter = 0; counter < array.size(); counter++) {
			System.out.println(array.get(counter).getName());
			if (array.get(counter).getName().length() > 10) {
				System.out.println(array.get(counter).getAge());
			}
		}

		for (int counter = 0; counter < array.size(); counter++) {
			if (array.get(counter) instanceof Student) {
				Student bobet = (Student) array.get(counter);
				bobet.outSick();
			}
		}

	}

}
