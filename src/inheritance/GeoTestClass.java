package inheritance;

import java.util.ArrayList;

public class GeoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Geo> array = new ArrayList<Geo>();
		array.add(new Rectangle(1, 1));
		array.add(new Rectangle(2, 2));
		array.add(new Rectangle(3, 3));
		array.add(new Trapezoid(1, 2, 3));
		array.add(new Trapezoid(2, 3, 4));
		array.add(new Trapezoid(3, 4, 5));
		double largest = 0;
		int num = 0;
		for (int counter = 0; counter < array.size(); counter++) {
			if (array.get(counter).area() > largest) {
				largest = array.get(counter).area();
				num = counter;
			}
		}
		
			if (array.get(num) instanceof Rectangle) {
				System.out.println("The largest area was a rectangle.");
			} else {
				System.out.println("The largest area was a trapezoid.");
			}
		System.out.println("Largest area: " + largest);
	}

}
