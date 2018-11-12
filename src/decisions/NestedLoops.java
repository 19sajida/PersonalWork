package decisions;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * int counter = 0; int number = 0; int sum =0; int counter2 =0; for
		 * (counter = 1; counter <= 4; counter++){ for (counter2 = 1; counter2
		 * <= 5; counter2++) {sum = counter*counter2; System.out.print(sum +
		 * "\t"); }System.out.println();}
		 * 
		 * 
		 * int counter = 0; int counter2 = 0; for (counter = 1; counter <= 4;
		 * counter++) { for (counter2 = 1; counter2 <= 5; counter2++) { if
		 * (counter2 != 3) { System.out.print(counter2 + "\t"); } else {
		 * System.out.print(counter + "\t"); }
		 * 
		 * } System.out.println(); }
		 

		int counter = 0;
		int counter2 = 0;
		int greatest = 0;
		int counter3 = 0;
		int number =0;
		for (counter = 1; counter <= 1000; counter++) {
			for (counter2 = 1; counter2 <= 1000; counter2++) {
				if (counter % counter2 == 0) {
					counter3++;
				}
				if (counter3 > greatest) {
					greatest = counter3; number=counter; 
				}
				
			}
			counter3 = 0;
		}
		System.out.println(number);
		
	
		
		int counter = 0;
		int counter2 = 0;
		int greatest = 0;
		int counter3 = 0;
		int number =0;
		int enter=0;
		System.out.println("Enter positive integer: ");
		enter = input.nextInt();
		for (counter = 1; counter <= enter; counter++) {
			for (counter2 = 1; counter2 <= enter; counter2++) {
				if (counter % counter2 == 0) {
					counter3++;
				}
				if (counter3 > greatest) {
					greatest = counter3; number=counter; 
				}
				
			}
			counter3 = 0;
		}
		System.out.println(number);
		*/
		
		int counter = 0;
		int counter2 =0;
		int number =0;
		for (counter = 1; counter <=5; counter++){
			for (counter2 = 1; counter2 <=6; counter2=counter2+1){
				System.out.print(counter2 + "\t");
			}
			number = 0;
			System.out.println();
		}
	}

}
