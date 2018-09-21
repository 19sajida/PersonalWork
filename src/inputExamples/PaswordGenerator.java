package inputExamples;
import java.util.Scanner;
public class PaswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
int first = 0;
System.out.println("Type in the first one digit integer");
first = input.nextInt();

int second = 0;
System.out.println("Type in the second one digit integer");
second = input.nextInt();

int third = 0;
System.out.println("Type in the third one digit integer");
third = input.nextInt();

System.out.println(first + "" + second + "" + third);
System.out.println(first + "" + third + "" + second);
System.out.println(second + "" + third + "" + first);
System.out.println(second + "" + first + "" + third);
System.out.println(third + "" + second + "" + third);
System.out.println(third + "" + first + "" + second);
	}

}
