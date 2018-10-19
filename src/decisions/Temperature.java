package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temperature = input.nextInt();
		if (temperature > 83) {
			System.out.println("Swimming");
		} else {
			if (temperature > 74) {
				System.out.println("Tennis");
			} else {
				if (temperature > 35) {
					System.out.println("Golf");
				} else {
					if (temperature > -10) {
						System.out.println("Snow Shoeing");
					} else {
						System.out.println("Nothing");
					}
				}
			}
		}
	}
}
