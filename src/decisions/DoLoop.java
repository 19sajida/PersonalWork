package decisions;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Integer:"); int num = input.nextInt(); do {
		 * System.out.println("magic product is:" + num * 17);
		 * System.out.println("Integer:"); num = input.nextInt(); } while (num != 9999);
		 * 
		 * System.out.println("Integer:"); int num = input.nextInt(); int largest = num;
		 * int smallest = num; do { if (largest < num) { largest = num; } if (smallest >
		 * num) { smallest = num; } System.out.println("Integer:"); num =
		 * input.nextInt(); } while (num != 9999); int range = largest - smallest;
		 * System.out.println("The range is:" + range);
		 * 
		 * 
		 * System.out.println("First Number: (999 to quit)"); double first =
		 * input.nextDouble(); double sum = 0; double second = 0; do {
		 * System.out.println("Second Number: (999 to quit)"); second =
		 * input.nextDouble(); sum = first + second; System.out.println("Sum: " + sum);
		 * System.out.println("First Number: (999 to quit)"); first =
		 * input.nextDouble(); } while (first != 999);
		 * 
		 * 
		 * int counter = 0; int total = 0; int number = 0; do {
		 * System.out.println("Enter number: "); number = input.nextInt(); counter++;
		 * total = total + number;
		 * 
		 * } while (total <= 2018); System.out.println(counter);
		 * 
		 * 
		 * double greatest = 0;
		 * System.out.println("What is the radius of the first circle?"); double one =
		 * input.nextDouble(); double largest =one; do { Circle bob = new Circle(one);
		 * greatest = bob.circumference();
		 * System.out.println("What is the radius of the second circle?"); double two =
		 * input.nextDouble(); Circle bob2 = new Circle(two); if (greatest <
		 * bob2.circumference()) { largest=two; }
		 * System.out.println("What is the radius of the third circle?"); double three =
		 * input.nextDouble(); Circle bob3 = new Circle(three); if (greatest <
		 * bob3.circumference()) { largest = three;}
		 * System.out.println("The circle with the greatest parameter has the radius: "
		 * + largest); System.out.
		 * println("What is the radius of the first circle? (Enter 9999 to quit)"); one
		 * = input.nextDouble(); greatest = bob.circumference(); largest = one;
		 * 
		 * } while (one != 9999);
		 */

		System.out.println("What is the longest side of the first triangle?");
		double one1 = input.nextDouble();
		double area = 0;
		double one2 = 0;
		double one3 = 0;
		double two1 = 0;
		double two2 = 0;
		double two3 = 0;
		double biggest = 0;
		do {
			System.out.println("What is the second side of the first triangle?");
			one2 = input.nextDouble();
			System.out.println("What is the third side of the first triangle?");
			one3 = input.nextDouble();
			RightTriangle bob = new RightTriangle(one2, one3);
			area = bob.area();
			System.out.println("What is the longest side of the second triangle?");
			two1 = input.nextDouble();
			System.out.println("What is the second side of the second triangle?");
			two2 = input.nextDouble();
			System.out.println("What is the third side of the second triangle?");
			two3 = input.nextDouble();
			RightTriangle bob2 = new RightTriangle(two2, two3);
			if (area < bob2.area()) {
				System.out.println("Triangle two has the larger area.");
			} else {
				System.out.println("Triangle one has the larger area");
				System.out.println("What is the longest side of the first triangle? (Enter 9999 to quit)");
				one1 = input.nextDouble();
			}
		} while (one1 != 9999);

	}

}
