package objectOrientedProgramming;

public class Numbers {
	public Numbers() {
	}

	public void sayNumber(double num) {
		System.out.println("Your number is: " + num);
	}

	public void sayNumberPlus2(double num) {
		num = num + 2;
		System.out.println("Your number plus 2 is: " + num);
	}

	public void saySum(double num, double num2) {
		double sum = num + num2;
		System.out.println("The sum of the two values is " + sum);
	}

	public double returnSquare(double num) {
		num = num * num;
		return num;
	}

	public double returnArea(double length, double width) {
		double area = length * width;
		return area;
	}
	public int returnRoundUp(double num)
	{int num2 = (int) Math.ceil(num);
	return num2;}
}
