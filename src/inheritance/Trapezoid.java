package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	public Trapezoid() {
		super();
	}

	public Trapezoid(double one, double two, double three) {
		super(one, two, one, three);
	}

	public double area() {
		double a = (super.getS3() + super.getS2()) / 2;
		double b = super.getS1() * super.getS1() - ((super.getS3() - super.getS2())/2) * ((super.getS3() - super.getS2())/2);
		double c = Math.sqrt(b) * a;
		return c;
	}
}
