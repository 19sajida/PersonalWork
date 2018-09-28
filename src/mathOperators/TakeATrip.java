package mathOperators;
import java.util.Scanner;
public class TakeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new  Scanner(System.in);
double distance = 0.0;
double mpg = 0.0;
double gallons = 0.0;
double money = 0.0;
double cost = 0.0;
System.out.println("What was the total distance traveled in miles?");
distance = input.nextDouble();
System.out.println("What is the fuel economy of the car in miles per gallon?");
mpg = input.nextDouble();
System.out.println("How many gallons of gas were used?");
gallons = input.nextDouble();
System.out.println("What was the total amount spent  on gas in dollars?");
money = input.nextDouble();
cost = (money/gallons);
System.out.println("Total distance traveled in miles: " + distance +
		" Gallons used: " + gallons + " Total money spent: $" + money + " Average cost per gallon of gas: $" + cost);
	}

}
