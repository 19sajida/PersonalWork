package inheritance;

public class Truck extends Auto {
	private boolean fourWD;

	public Truck(boolean one) {
		fourWD = one;
	}

	public boolean getFourWD() {
		return fourWD;
	}

	public String toString() {
		return " Four WD: " + fourWD + super.toString();
	}

	public boolean equals(Object other) {
		if (other.toString().equals(this.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
