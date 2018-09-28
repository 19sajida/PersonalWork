package mathOperators;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int one = 0;
		int two = 0;
		int three = 0;
		int total = 0;
		System.out.println("What is the age of friend one?");
		one = input.nextInt();
		System.out.println("What is the age of friend two?");
		two = input.nextInt();
		System.out.println("What is the age of friend three?");
		three = input.nextInt();
		total = (one + two + three);
		System.out.println("The sum of all the ages is " + total);
	}

}
