package mathOperators;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age = 0;
System.out.println("How old are you?");
age = input.nextInt();
age = (18-age);
System.out.println("It will be " + age + " years until you can vote.");
	}

}
