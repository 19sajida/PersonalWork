package decisions;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Integer:"); int num = input.nextInt(); do {
		 * System.out.println("magic product is:" + num * 17);
		 * System.out.println("Integer:"); num = input.nextInt(); } while (num
		 * != 9999);
		 * 
		 * System.out.println("Integer:"); int num = input.nextInt(); int
		 * largest = num; int smallest = num; do { if (largest < num) { largest
		 * = num; } if (smallest > num) { smallest = num; }
		 * System.out.println("Integer:"); num = input.nextInt(); } while (num
		 * != 9999); int range = largest - smallest;
		 * System.out.println("The range is:" + range);
		 * 
		 * 
		 * System.out.println("First Number: (999 to quit)"); double first =
		 * input.nextDouble(); double sum = 0; double second = 0; do {
		 * System.out.println("Second Number: (999 to quit)"); second =
		 * input.nextDouble(); sum = first + second; System.out.println("Sum: "
		 * + sum); System.out.println("First Number: (999 to quit)"); first =
		 * input.nextDouble(); } while (first != 999);
		 

		int counter = 0;
		int total = 0;
		int number = 0;
		do {
			System.out.println("Enter number: ");
			number = input.nextInt();
			counter++;
			total = total + number;

		} while (total <= 2018);
		System.out.println(counter);
		*/

		double greatest =0;
		System.out.println("What is the radius of the first circle? (Enter 9999 to quit)");
		double one = input.nextDouble();
		Circle bob = new Circle(one);
		greatest = bob.circumference();
do { 	
System.out.println("What is the radius of the second circle?");
double two = input.nextDouble();
Circle bob2 = new Circle(two);
if (greatest<bob2.circumference()){greatest=bob2.circumference();}
System.out.println("What is the radius of the first circle?");
double three = input.nextDouble();
Circle bob3 = new Circle(three);
if (greatest<bob3.circumference()){greatest=bob3.circumference();
System.out.println("What is the radius of the first circle? (Enter 9999 to quit)");
one = input.nextDouble();
greatest = bob.circumference(); System.out.println(greatest);}
}while(one!=9999);
	}

}
