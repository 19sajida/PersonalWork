package decisions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your GPA?");
double gpa = input.nextDouble();
System.out.println("Are you a senior?");
boolean senior = input.nextBoolean();
if ((gpa>=3.5)&(senior=true)){System.out.println("You will graduate with honors.");}
else{System.out.println("You will not graduate with honors.");}
}
	}

