package mathOperators;
import java.util.Scanner;
public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int height = 0;
int width = 0;
int depth = 0;
int volume = 0;
System.out.println("What is the height of the box in inches?");
height = input.nextInt();
System.out.println("What is the width of the box in inches?");
width = input.nextInt();
System.out.println("What is the depth of the box in inches?");
depth = input.nextInt();
volume = height*width*depth;
System.out.println("The volume of the box is " + volume + " inches");
	}

}
