package inheritance;

public class Rectangle extends Parallelogram implements Geo {
	public Rectangle() {
		super();
	}

	public Rectangle(double ss1, double ss2) {
		super(ss1, ss2, ss2);
	}

	public double area() {
		return super.getS1() * super.getS2();

	}

	public boolean equals(Object other) {
		if (other.toString().equals(this.toString())) {

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return super.toString();
	}

	public Object clone() {
		return new Rectangle(super.getS1(), super.getS2());
	}

}
