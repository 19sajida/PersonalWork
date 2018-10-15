package objectOrientedProgramming;
import java.util.Scanner;
public class Sandbox {
	public static void main(String[] args) 
{Scanner input = new Scanner(System.in);
System.out.println("What is the width of the sandbox in feet?");
double width = input.nextDouble();
System.out.println("What is the length of the sandbox in feet?");
double length = input.nextDouble();
System.out.println("What is the depth of the sandbox in feet?");
double depth = input.nextDouble();
double volume = length*width*depth;
System.out.println("How many cubic feet of sand can you transport per hour?");
double transport = input.nextDouble();
double time = volume/transport;
System.out.println("It will take "  + time + " hours to fill up the sand box");
	}
}
