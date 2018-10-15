package objectOrientedProgramming;

public class Worker {
	private double hours;
	private double rate;

	public Worker() {
		hours = 40;
		rate = 7.25;
	}

	public Worker(double hours2, double rate2) {
		rate = rate2;
		hours = hours2;
	}

	public double getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public void setHours(double hours2) {
		hours = hours2;
	}

	public void setRate(double rate2) {
		rate = rate2;
	}

	public double payCheck() {
		double check = rate * hours;
		return check;
	}

	public void raise(double add) {
		rate = add + rate;
	}

}
