package inheritance;

public class Car extends Auto {
	private int cupHolders;

	public Car(int cupHolders2) {
		cupHolders = cupHolders2;
	}

	public int getCupHolders() {
		return cupHolders;
	}
}
