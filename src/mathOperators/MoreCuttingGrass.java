package mathOperators;
import java.util.Scanner;
public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double cost = 0.0;
double width = 0.0;
double length = 0.0;
double deck = 0.0;
double speed = 0.0;
double area = 0.0;
double time = 0.0;
System.out.println("What is the length of the lawn in feet?");
length = input.nextDouble();
System.out.println("What is the width of the lawn in in feet?");
width = input.nextDouble();
System.out.println("What is the width of the mower deck in inches?");
deck = input.nextDouble();
System.out.println("What is the speed of the mower?");
speed = input.nextDouble();
width = (width*12/deck);
area = (length*width*12);
time = (area/(speed*5280*12));
cost = (12*time);
cost = (Math.round(cost*100));
cost = (cost/100);
System.out.println("It will take " + time + " hours to mow the lawn.");
System.out.println("It will cost $" + cost);



	}

}
