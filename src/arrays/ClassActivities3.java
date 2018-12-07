package arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ClassActivities3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random numbers = new Random(1);

		/*
		 * ArrayList<String> array = new ArrayList<String>();
		 * array.add("Bob Smith"); array.add("Jane Miller"); array.add(1,
		 * "Billy Jones"); System.out.println("Enter name: "); String name =
		 * input.nextLine(); array.add(name);
		 * 
		 * for (int counter = 0; counter < array.size(); counter++) {
		 * System.out.println(array.get(counter)); }
		 * 
		 * ArrayList<Friend> array2 = new ArrayList<Friend>(); array2.add(new
		 * Friend("Bob Smith", 17)); array2.add(0, new Friend("Jane Miller",
		 * 15)); array2.add(0, new Friend("Billy Jones", 12));
		 * 
		 * for (int counter = 0; counter < array2.size(); counter++) {
		 * System.out.println(array2.get(counter).getAge()); }
		 * 
		 * 
		 * 
		 * ArrayList<Rectangle> array = new ArrayList<Rectangle>(); int min =
		 * 50; int max =70; int length =0; int width=0; for (int counter = 0;
		 * counter<400; counter++){ length = min + numbers.nextInt(max-min+1);
		 * width = min + numbers.nextInt(max-min+1); array.add(new Rectangle
		 * (length, width)); } for(int counter2=0; counter2<400; counter2++){
		 * System.out.println(array.get(399-counter2).area()); }
		 * 
		 * 
		 * ArrayList<String> array = new ArrayList<String>(); for (int counter =
		 * 0; counter < 50; counter++) { System.out.println("Enter name: ");
		 * String name = input.nextLine(); array.add(name); }
		 * array.remove(array.size() - 1); array.remove(0); for (int counter2 =
		 * 0; counter2 < array.size(); counter2++) {
		 * System.out.println(array.get(counter2)); }
		 * 
		 
		ArrayList<Rectangle> array = new ArrayList<Rectangle>();
		int min = 50;
		int max = 70;
		int length = 0;
		int width = 0;
		int min2 = 0;
		for (int counter = 0; counter < 400; counter++) {
			length = min + numbers.nextInt(max - min + 1);
			width = min + numbers.nextInt(max - min + 1);
			array.add(new Rectangle(length, width));
		}
		int max2 = array.size();
		int num = min2 + numbers.nextInt(max2 - min2 + 1);
		Rectangle trash = array.remove(num);
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			System.out.println(array.get(array.size() - 1 - counter2).area());
		}
		System.out.println("Removed area: " + trash.area());
		
		*/
		ArrayList<Rectangle> array = new ArrayList<Rectangle>();
		for (int counter = 0; counter < 4; counter++) {
			System.out.println("Enter length: ");
			 int length = input.nextInt();
			 System.out.println("Enter width: ");
			int width = input.nextInt();
			array.add(new Rectangle(length, width));
		}
		int max2 = array.size()-1;
		Rectangle trash = array.remove(max2);
		array.set(0, trash);
		for (int counter2 = 0; counter2 < array.size(); counter2++) {
			System.out.println(array.get(counter2).getLength() + " " + array.get(counter2).getWidth());
		}
	}

}
