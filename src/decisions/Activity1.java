package decisions;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * int count = 0; while(count <=100){System.out.println(count); count
		 * ++;}
		 * 
		 * 
		 * int count = 2; while(count <=100000){System.out.println(count);count
		 * +=2;}
		 * 
		 * System.out.println("What is the largest positive integer value?");
		 * int max = input.nextInt(); int count = 2; while(count
		 * <=max){System.out.println(count);count +=2;}
		 * 
		 * 
		 * System.out.println("What is the largest positive integer value?");
		 * int max = input.nextInt(); int count = 2; int sum = 0; while (count
		 * <= max) { sum += count; count += 2; System.out.println(sum); int num
		 * = 0; while (num != 9999) {
		 * 
		 * System.out.println(num * 2) ;
		 * System.out.println("Please enter number(9999 to quit):"); num =
		 * input.nextInt(); }
		 

		System.out.println("Please enter number(9999 to quit):");
		double num = input.nextDouble();
		double average = 0.0;
		double sum = 0.0;
		double number = 0.0;
		while (num != 9999) {
			number++;
			sum = num + sum;
			average = sum / number;
			System.out.println("Please enter number(9999 to quit):");
			num = input.nextDouble();
		}
		System.out.println(average); */
System.out.println("Please enter number(9999 to quit):");
double largest =0;
double num1 = input.nextDouble();
while(num1 !=9999){ if (largest<num1){largest=num1;}else{}System.out.println("Please enter number(9999 to quit):");
num1 = input.nextDouble();
}
System.out.println(largest);
	}

}
