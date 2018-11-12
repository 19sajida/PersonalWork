package decisions;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
int age = input.nextInt();
System.out.println("What is your weight?");
int weight = input.nextInt();
if (age>=18){System.out.println("Your lucky number is:" + age*5);}
else{System.out.println("Your lucky number is:" + weight/2);}
	}

}
