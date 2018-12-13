package arrays;

import java.util.Scanner;
import java.util.Random;

public class ClassActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random number = new Random();

		/*
		 * int [] testscores = new int [5]; for (int counter=0; counter <
		 * testscores.length; counter++){ System.out.println("Give a score:");
		 * testscores [counter] = input.nextInt(); } int sum = 0; for (int
		 * counter=0; counter < testscores.length; counter++){ sum = sum +
		 * testscores [counter]; } System.out.println("Sum: " + sum);
		 * 
		 * 
		 * String[] names = new String[20]; for (int counter = 0; counter <
		 * names.length; counter++) { System.out.println("Enter name:");
		 * names[counter] = input.nextLine(); } for (int counter2 = 1; counter2
		 * <= names.length; counter2++) { System.out.println(names[names.length
		 * - counter2]); } System.out.println("Enter a letter: "); String letter
		 * = input.nextLine(); for (int counter3 = 0; counter3 < names.length;
		 * counter3++) { if (names[counter3].charAt(names[counter3].length() -
		 * 1) == letter.charAt(0)) { System.out.println(names[counter3]); } }
		 * 
		 * 
		 * String[] names = new String[3]; for (int counter = 0; counter <
		 * names.length; counter++) { System.out.println("Enter name:");
		 * names[counter] = input.nextLine();
		 * 
		 * } System.out.println("Enter a length: "); int letter =
		 * input.nextInt(); int number=0; for (int counter3 = 0; counter3 <
		 * names.length; counter3++) { if (names[counter3].length() == letter) {
		 * number++;} }
		 * System.out.println("Number of friends with that many letters:" +
		 * number);
		 * 
		 * int min = 10; int max = 56; int small = min * max; int smallIndex =
		 * 0; int length = 0; int width = 0; final int num = 2; Rectangle[] rec
		 * = new Rectangle[num]; for (int counter = 0; counter < rec.length;
		 * counter++) { length = min + number.nextInt(max - min + 1); width =
		 * min + number.nextInt(max - min + 1); rec[counter] = new
		 * Rectangle(length, width); } for (int counter = 0; counter <
		 * rec.length; counter++) { System.out.println("\nLength: " +
		 * rec[counter].getLength()); System.out.println("Width: " +
		 * rec[counter].getWidth()); System.out.println("Area: " +
		 * rec[counter].area()); } for (int counter = 0; counter < rec.length;
		 * counter++) { if (rec[counter].area() < small) { small =
		 * rec[counter].area(); smallIndex = counter; } }
		 * System.out.println("\nSmallest area: " + small);
		 * System.out.println("Smallest area index: " + smallIndex);
		 * 
		 * Rectangle newRec = rec[0]; rec[0] = rec[smallIndex]; rec[smallIndex]
		 * = newRec; for (int counter = 0; counter < rec.length; counter++) {
		 * System.out.println(rec[counter].area());}
		 * 
		 * 
		 * System.out.println("Enter a sentence: "); String sentence =
		 * input.nextLine(); String[] words = sentence.split(" "); for (int
		 * counter = 0; counter < words.length; counter++) {
		 * System.out.println(words[counter].charAt(0)); }
		 */

		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int low = 0;
		int high = words.length - 1;
		int num = low + number.nextInt(high - low + 1);
		System.out.println(words[num]);
	}

}
