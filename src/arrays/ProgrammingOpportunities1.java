package arrays;

import java.util.Scanner;
import java.util.Random;

public class ProgrammingOpportunities1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random();

System.out.println("How manys students are in the class?");
int students = input.nextInt();
System.out.println("How manys rolls per student?");
int rolls = input.nextInt();
System.out.println("How manys sides on the dice?");
int max = input.nextInt();
int min = 0;
int [][]array = new int [students][rolls];
for (int counter =0; counter < students; counter++){
	for (int counter2 = 0; counter2 < rolls; counter2++){
		array[counter][counter2] = min + numbers.nextInt(max - min + 1);
		System.out.print("Student " + counter + ": " + array[counter][counter2] + " ");
	}
	System.out.println();
}
	}

}
