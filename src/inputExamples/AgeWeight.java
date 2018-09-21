package inputExamples;
import java.util.Scanner; 
public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 18;
int weight = 100;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
System.out.println(age + " years old");
System.out.println("What is your weight in pounds?");
weight = input.nextInt();
System.out.println(weight + " pounds");;
	}

}
