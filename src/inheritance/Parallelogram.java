package inheritance;

public class Parallelogram extends Quadrilateral implements Geo{
	public Parallelogram() {
		super();
	}

	public Parallelogram (double ss1, double ss2) {
		super(ss1, ss2, ss1, ss2);
}
	public double area(){
		return super.getS1()*super.getS2();
	}
}
