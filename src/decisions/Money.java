package decisions;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println("What is your GPA?");
double gpa = input.nextDouble();
double sum = age+gpa;
int money = 30;
if (sum>20){money =250;}
System.out.println("You will receive $" + money);
	}

}
