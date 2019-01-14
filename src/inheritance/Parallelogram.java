package inheritance;

public class Parallelogram extends Quadrilateral implements Geo {
	private double height;

	public Parallelogram() {
		super();
		height = 0;
	}

	public Parallelogram(double ss1, double ss2, double ss3) {
		super(ss1, ss2, ss1, ss2);
		height = ss3;
	}

	public double area() {
		return super.getS1() * height;
	}

	public String toString() {
		return super.toString() + " Height: " + height;
	}

	public boolean equals(Object other) {
		if (other.toString().equals(this.toString())) {

			return true;
		} else {
			return false;
		}
	}

	public Object clone() {
		return new Parallelogram(super.getS1(), super.getS2(), height);
	}
}
