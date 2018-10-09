package objectOrientedProgramming;

import java.util.Scanner;

public class SandboxTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the sandbox in feet?");
		double width = input.nextDouble();
		System.out.println("What is the length of the sandbox in feet?");
		double length = input.nextDouble();
		System.out.println("What is the depth of the sandbox in feet?");
		double depth = input.nextDouble();
		System.out.println("How many cubic feet of sand can you transport per hour?");
		double transport = input.nextDouble();
		Sandbox2And3 bob = new Sandbox2And3();
		bob.Sandbox2(length, width, depth, transport);
	}

}
