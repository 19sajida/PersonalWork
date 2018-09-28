package mathOperators;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double cost = 0.0;
double length = 0.0;
double width = 0.0;
double radius = 0.0;
double rectangle = 0.0;
double circle = 0.0;
System.out.println("What is the length of the lawn in yards?");
length = input.nextDouble();
System.out.println("What is the width of the lawn in yards?");
width = input.nextDouble();
System.out.println("What is the radius of the fountain in yards?");
radius = input.nextDouble();
rectangle = (length*width);
circle = (radius*radius*3.14);
cost = ((rectangle-circle)*3.0/100.0*1.25);
cost = Math.round(cost*100);
cost = (cost/100);
System.out.println("You owe $" + cost + " for cutting the lawn");
	}

}
