package designingClasses;

import java.util.Random;

public class PileOJunk {
	Random numbers = new Random();
	private static int idnumber;
	private int num;

	public PileOJunk() {
		int max = 100;
		int min = 10;
		num = min + numbers.nextInt(max - min + 1);
		idnumber = 10;
	}

	public int getNumber() {
		int number = idnumber;
		idnumber += 10;
		return number;
	}

	public static int sum(int one, int two) {
		int sum = one + two;
		return sum;
	}

	public void overwrite(int num) {
		this.num = num;
	}
}
