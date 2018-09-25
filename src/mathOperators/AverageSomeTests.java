package mathOperators;
import java.util.Scanner;
public class AverageSomeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int one = 0;
int two = 0;
int three = 0;
int average = 0;
System.out.println("What was the score on the first test?");
one = input.nextInt();
System.out.println("What was the score on the second test?");
two = input.nextInt();
System.out.println("What was the score on the third test?");
three = input.nextInt();
average = ((one + two + three)/3);
System.out.println("Test one score: " + one + " Test two score: " + two + " Test three score: " + three + " Average score: " + average );
	}

}
