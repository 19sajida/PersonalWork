package inheritance;

public class Quadrilateral{
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 1;
		s2 = 1;
		s3 = 1;
		s4 = 1;
	}

	public Quadrilateral(double ss1, double ss2, double ss3, double ss4) {
		s1 = ss1;
		s2 = ss2;
		s3 = ss3;
		s4 = ss4;
	}

	public double getS1() {
		return s1;
	}

	public double getS2() {
		return s2;
	}

	public double getS3() {
		return s3;
	}

	public double getS4() {
		return s4;
	}

	public void setS1(double sss1) {
		s1 = sss1;
	}

	public void setS2(double sss2) {
		s2 = sss2;
	}

	public void setS3(double sss3) {
		s3 = sss3;
	}

	public void setS4(double sss4) {
		s4 = sss4;
	}

	public double perimeter() {
		double perimeter = s1 + s2 + s3 + s4;
		return perimeter;
	}
}
