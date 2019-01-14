package inheritance;

public class Square extends Rectangle implements Geo {
	public Square() {
		super();
	}

	public Square(double one) {
		super(one, one);
	}

	public double area() {
		return super.getS1() * super.getS1();
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
		return new Square(super.getS1());
	}
}
