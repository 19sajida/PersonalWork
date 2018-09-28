package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double total = 0.0;
double total2 = 0.0;
int dollars = 0;
int quarters = 0;
int dimes = 0;
int nickels = 0;
int pennies = 0;
final int DOLLARS = 100;
final int QUARTERS = 25;
final int DIMES = 10;
final int NICKELS = 5;
final int PENNIES = 1;
System.out.println("What is the amount you want to make change for?");
total = input.nextDouble();
total2 = (total*100);
dollars = ((int) total2/DOLLARS);
quarters = ((int) (total2-dollars*DOLLARS)/QUARTERS);
dimes = ((int) (total2-dollars*DOLLARS-quarters*QUARTERS)/DIMES);
nickels = ((int) (total2-dollars*DOLLARS-quarters*QUARTERS-dimes*DIMES)/NICKELS);
pennies = ((int) (total2-dollars*DOLLARS-quarters*QUARTERS-dimes*DIMES-nickels*NICKELS));
System.out.println("Amount to break down: " + total + " Dollars: " + dollars + " Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels + " Pennies: " + pennies);
	}

}
