package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
final double height = 8.0;
double length = 0.0;
double width = 0.0;
double gallon = 0.0;
System.out.println(("What is the length of the room in feet?"));
length = input.nextInt();
System.out.println("What is the width of the room in feet?");
width = input.nextInt();
gallon = (((length*height*2)+(width*height*2))/150.0);
System.out.println("You will need " + gallon + " of paint.");

	}

}
