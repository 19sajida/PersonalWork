package decisions;
import java.util.Scanner;
public class Weigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How much do you weigh?");
double weight = input.nextDouble();
System.out.println("What planet are you on? \n 1. Mercury \n 2. Venus \n 3. Mars \n 4. Jupiter \n 5. Saturn");
int planet = input.nextInt();
switch (planet)
{case 1: weight = weight*.37; break;
case 2: weight = weight*.88; break;
case 3: weight = weight*.38; break;
case 4: weight = weight*2.64; break;
case 5: weight = weight*1.15; break;
}
System.out.println("Your weight is: " + weight);
	}

}
