package mathOperators;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double radius = 0.0;
double volume = 0.0;
System.out.println("What is the radius of the sphere in inches?");
radius = input.nextDouble();
volume = (4.0/3.0)*Math.PI*(radius*radius*radius);
System.out.println("The volume is " + volume + " inches.");
	}

}
