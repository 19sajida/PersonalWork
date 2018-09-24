package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int dividend = 1;
int divisor = 1;
int result = 1;
int remainder = 1;
System.out.println("What is the dividend?");
dividend = input.nextInt();
System.out.println("What is the divisor?");
divisor = input.nextInt();
result = dividend/divisor;
remainder = dividend%divisor;
System.out.println("Result:" + result + "r" + remainder);
	}

}
