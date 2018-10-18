package decisions;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How much money did you receive for your fifth birthday?");
double money = input.nextDouble();
if (Math.abs(money-Math.sqrt(84.3))<0.01){System.out.println("You received a good prize.");}
else{System.out.println("You received a bad prize.");}
	}
}
