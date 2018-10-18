package decisions;
import java.util.Scanner;
public class CostForInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println("What is your weight");
int weight = input.nextInt();
System.out.println("Do you smoke?");
boolean smoke = input.nextBoolean();
double pay = 200.0;
if (age>75){pay=pay+125;}
if (age<30){pay=pay-25;}
if (weight>700){pay=pay+300;}
if (smoke==true){pay=pay+50;}
else{pay=pay-40;}
System.out.println("Your insurance is $" + pay);
	}

}
