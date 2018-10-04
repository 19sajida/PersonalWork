package objectOrientedProgramming;
import java.util.Scanner;
public class House {
public House()
{}
public void minutes()
{System.out.println("What is the length of the wall in feet?");
Scanner input = new Scanner(System.in);
double length = input.nextDouble();
System.out.println("What is the height of the wall in feet?");
double height = input.nextDouble();
double area = height*length;
double time = (area/200);
System.out.println("It will take " + time + " hours to paint the wall.");

}
}
