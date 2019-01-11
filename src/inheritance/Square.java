package inheritance;

public class Square extends Rectangle implements Geo{
	public Square() {
		super();
	}

	public Square(double one) {
		super(one, one);
	}

	public double area() {
		return super.getS1() * super.getS1();
	}
}
