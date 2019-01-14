package inheritance;

public class Auto {
	private double odometer;
	private double mPG;

	public Auto() {
		odometer = 0;
		mPG = 0;
	}

	private Auto(double one, double two) {
		odometer = one;
		mPG = two;
	}

	public double getOdometer() {
		return odometer;
	}

	public double getMPG() {
		return mPG;
	}

	public void drive(double miles) {
		if (miles >= 0) {
			odometer = odometer + miles;
		}
	}

	public String toString() {
		return " Odometer: " + odometer + " MPG: " + mPG;
	}
}
