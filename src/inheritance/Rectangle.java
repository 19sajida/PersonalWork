package inheritance;

public class Rectangle extends Parallelogram implements Geo{
	public Rectangle() {
		super();
	}

	public Rectangle(double ss1, double ss2) {
		super(ss1, ss2);
	}

	public double area() {
		return super.getS1() * super.getS2();

	}
}
