package mathOperators;
import java.util.Scanner;
public class PullPhoneNumberApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int phone = 0;
int area = 0;
int middle = 0;
int last = 0;
System.out.println("What is your phone number (no dashes)?");
phone = input.nextInt();
System.out.println("Phone number: " + phone);
area = (phone/10000000);
System.out.println("Area code: " + area);
middle = ((phone-area*10000000)/10000);
System.out.println("Middle three digits: " + middle);;
last = (phone-area*10000000-middle*10000);
System.out.println("Last four digits: " + last);;

	}

}
