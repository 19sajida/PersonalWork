package objectOrientedProgramming;

public class NumberTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numbers bob = new Numbers();
		bob.sayNumber(7.5);
		bob.sayNumberPlus2(7.5);
		bob.saySum(1.2, 1.8);
		double answer = bob.returnSquare(9.0);
		System.out.println("Your number is " + answer);
		double area = bob.returnArea(4.0, 6.0);
		System.out.println("Area: " + area);
		int round = bob.returnRoundUp(7.8);
		System.out.println("Your rounded up number is " + round);
	}

}
