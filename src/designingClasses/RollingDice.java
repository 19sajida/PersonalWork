package designingClasses;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);
		int min = 1;
		int max = 6;
		ArrayList<Integer> array = new ArrayList<Integer>();
		double count = 0.0;
		for (int counter = 0; counter < 487; counter++) {
			int num = min + numbers.nextInt(max - min + 1);
			if (num % 2 != 0) {
				count++;
			}
			array.add(num);
		}

		for (int counter = array.size() - 1; counter >= 0; counter--) {
			System.out.println(array.get(counter));
		}
		System.out.println(count / array.size());
	}

}
