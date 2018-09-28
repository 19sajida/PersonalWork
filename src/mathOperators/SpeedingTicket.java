package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		int speed = 0;
int limit = 0;
int ticket = 0;
System.out.println("What is the speed limit in miles per hour?");
limit = input.nextInt();
System.out.println("What was your speed in miles per hour?");
speed = input.nextInt();
ticket = (55+(speed-limit)*40);
System.out.println("Your speed was " + speed + " miles per hour, the speed limit was " + limit + " miles per hour, and your ticket is $" + ticket);

	}

}
