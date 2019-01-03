package designingClasses;

import java.util.Scanner;

public class DetentionSupervisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows = 1;
		int columns = 2;
		Student[][] array = new Student[rows][columns];
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				System.out.println("Enter name: ");
				String name = input.nextLine();
				System.out.println("Enter grade: ");
				int grade = input.nextInt();
				input.nextLine();
				array[counter][counter2] = new Student(name, grade);
			}
		}
		double total = 0;
		int nine = 0;
		double twelve = 0;
		for (int counter = 0; counter < rows; counter++) {
			for (int counter2 = 0; counter2 < columns; counter2++) {
				total = total + array[counter][counter2].getName().length();
				if (array[counter][counter2].getGrade() == 9) {
					nine++;
				}
				if (array[counter][counter2].getGrade() == 12) {
					twelve++;
				}

			}
		}
		double average = total / (rows * columns);
		double percentage = twelve / (rows * columns)*100;
		System.out.println("Average name length: " + average);
		System.out.println("Number of ninth graders: " + nine);
		System.out.println("Percentage of twelth graders: " + percentage + "%");
	}
}
