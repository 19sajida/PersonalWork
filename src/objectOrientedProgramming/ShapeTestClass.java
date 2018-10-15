package objectOrientedProgramming;
import java.util.Scanner;
public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is the length of the rectangle in feet?");
double length = input.nextDouble();
System.out.println("What is the width of the rectangle in feet?");
double width = input.nextDouble();
System.out.println("What is the length of radius of the circle in feet?");
double radius1 = input.nextDouble();
System.out.println("What is the length of the right triangle in feet?");
double length2 = input.nextDouble();
System.out.println("What is the height of the right triangle in feet?");
double height2 = input.nextDouble();
System.out.println("What is the length of base#1 of the trapezoid in feet?");
double base1 = input.nextDouble();
System.out.println("What is base#2 of the trapezoid in feet?");
double base2 = input.nextDouble();
System.out.println("What is the length of a non-parallel the trapezoid in feet?");
double length1 = input.nextDouble();
System.out.println("What is the height of the trapezoid in feet?");
double height = input.nextDouble();
RightTriangle bob = new RightTriangle(length2, height2);
Circle sabrina = new Circle(radius1);
IsoscelesTrapezoid christian = new IsoscelesTrapezoid(base1, base2, height, length1);
Rectangle joey = new Rectangle(length, width);
System.out.println("The perimeter of the rectangle is " + joey.perimeter());
System.out.println("The area of the rectangle is " + joey.area());
System.out.println("The circumference of the circle is " + sabrina.circumference());
System.out.println("The area of the circle is " + sabrina.area());
System.out.println("The perimeter of the right triangle is " + bob.perimeter());
System.out.println("The area of the right triangle is " + bob.area());
System.out.println("The perimeter of the isosceles trapezoid is " + christian.perimeter());
System.out.println("The area of the isosceles trapezoid is " + christian.area());
	}

}
