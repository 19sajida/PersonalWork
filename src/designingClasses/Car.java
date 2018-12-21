package designingClasses;

public class Car {
	private double mpg;
	private double capacity;
	private double fuel;
	private double odometer;

	public Car() {
		mpg = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;
	}

	public Car(double newMPG, double newCapacity, double newFuel, double newOdometer) {
		if (newMPG > 0 & newCapacity > 0 & newFuel > 0 & odometer > 0) {
			mpg = newMPG;
			capacity = newCapacity;
			fuel = newFuel;
			odometer = newOdometer;
		}

	}

	public double getMPG() {
		return mpg;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFuel() {
		return fuel;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setMPG(double newMpg) {
		if (newMpg > 0) {
			mpg = newMpg;
		}
	}

	public void setCapacity(double newCapacity) {
		if (newCapacity > 0) {
			capacity = newCapacity;
		}
	}

	public void setFuel(double newFuel) {
		if (newFuel > 0) {
			fuel = newFuel;
		}
	}

	public void setOdometer(double newOdometer) {
		if (newOdometer > 0) {
			odometer = newOdometer;
		}
	}

	public void fillTank(double gallonsAdded) {
		if (gallonsAdded > 0) {
			fuel = fuel + gallonsAdded;
		}
	}

	public void driveCar(double milesTraveled) {
		if (milesTraveled > 0) {
			fuel = fuel - (milesTraveled / mpg);
			odometer = odometer + milesTraveled;
		}

	}

	public String toString() {
		return ("mpg: " + mpg + " capacity: " + capacity + " fuel: " + fuel + " odometer: " + odometer);
	}

	public boolean equals(Car other) {
		if (this.toString().equals(other.toString()) == true) {
			return true;
		} else {
			return false;
		}
	}
	public Car clone() {
		return new Car(mpg, capacity, fuel, odometer);
	}

}
