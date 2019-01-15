package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class AutoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Auto> array = new ArrayList<Auto>();
		Random numbers = new Random(1);
		int min = 0;
		int max = 100;
		double total = 0;
		int wheels = 0;
		int cups = 0;
		double total2=0;
		array.add(new Car(2));
		array.add(new Car(1));
		array.add(new Truck(true));
		array.add(new Truck(false));
		for (int counter = 0; counter < array.size(); counter++) {
			int num = min + numbers.nextInt(max - min + 1);
			array.get(counter).drive(num);
			total = total + array.get(counter).getOdometer();
			total2=total2+array.get(counter).getMPG();
			if (array.get(counter) instanceof Car) {
				Car bob = (Car) array.get(counter);
				cups = cups + bob.getCupHolders();
			}
			if (array.get(counter) instanceof Truck) {
				Truck bob = (Truck) array.get(counter);
				if (bob.getFourWD() == true) {
					wheels++;
				}
			}
		}
		System.out.println("Total milage: " + total);
		System.out.println("Average MPG: " + total2 / array.size());
		System.out.println("Total number of cup holders in cars: " + cups);
		System.out.println("Number of trucks with four wheel drive: " + wheels);
	}

}
