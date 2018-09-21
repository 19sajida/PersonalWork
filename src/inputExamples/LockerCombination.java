package inputExamples;
import java.util.Scanner; 
public class LockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int first = 0;
System.out.println("What is the first number of your locker combination?");
first = input.nextInt();

int second = 0;
System.out.println("What is the second number of your locker combination?");
second = input.nextInt();

int third = 0;
System.out.println("What is the third number of your locker combination?");
third = input.nextInt();

System.out.println(first + "-" + second + "-" + third);
	}

}
