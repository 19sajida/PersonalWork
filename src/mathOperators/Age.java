package mathOperators;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age = 0;
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("You will be " + (age+7) + " in 7 years.");
	}

}
