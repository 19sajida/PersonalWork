package decisions;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What was your percentage on your first test?");
double first = input.nextDouble();
System.out.println("What was your percentage on your second test?");
double second = input.nextDouble();
System.out.println("What was your percentage on your third test?");
double third = input.nextDouble();
double average = (first+second+third)/3.0;
if (average>=92.5){System.out.println("Average: " + average + " Grade: A");}
else{
	if(average >=84.5){System.out.println("Average: " + average + " Grade: B");}
	else{
		if(average>=77.5){System.out.println("Average: " + average + " Grade: C");}
		else{
			if(average>=69.5){System.out.println("Average: " + average + " Grade: D");}
			else{System.out.println("Average: " + average + " Grade: F");}
		}
	}
	}
	}
}
