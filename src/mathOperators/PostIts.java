package mathOperators;
import java.util.Scanner;
public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double length = 0.0;
double width = 0.0;
double area = 0.0;
final double postit = 9.0;
double number = 0;
System.out.println("What is the length of the wall in inches?");
length = input.nextDouble();
System.out.println("What is the width of the wall in inches?");
width = input.nextDouble();
area = (length*width);
number = (area/postit);
System.out.println("It will take " + number + " of post-its to cover the wall.");
	}

}
