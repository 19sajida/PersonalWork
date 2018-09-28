package mathOperators;
import java.util.Scanner;
public class PullSSNApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int ssn = 0;
int age = 0;
int years = 0;
int last = 0;
int first = 0;
System.out.println("What is your social security number?");
ssn = input.nextInt();
System.out.println("How old are you?");;
age = input.nextInt();
years = (18-age);
first = (ssn/10000);
last = ((ssn-first*10000));
System.out.println("You are " + age + " years old.");
System.out.println("I have " + years + " until I can vote.");
System.out.println("Your social security number is " + ssn + ".");
System.out.println("The last four digits are " + last + ".");
	}

}
