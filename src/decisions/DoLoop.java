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
		 */
		System.out.println("Integer:");
		int num = input.nextInt();
		int largest = num;
		int smallest = num;
		do {
			if (largest < num) {
				largest = num;
			}
			if (smallest > num) {
				smallest = num;
			}
			System.out.println("Integer:");
			num = input.nextInt();
		} while (num != 9999);
		int range = largest - smallest;
		System.out.println("The range is:" + range);
	}

}
