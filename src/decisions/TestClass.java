package decisions;
import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println(age==16);*/
Scanner input = new Scanner(System.in);
System.out.println("What is your height?");
double height = input.nextDouble();
System.out.println("What is your shoe size?");
int shoesize = input.nextInt();
double sum = shoesize+height;
System.out.println(sum>=26);
	}

}
