package strings;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
/*
System.out.println("What is your age?");
int age = input.nextInt();
input.nextLine();
System.out.println("What is your name?");
String name = input.nextLine();
System.out.println("Name: " + name + " Age: " + age);


System.out.println("Type a sentence: ");
String sentence = input.nextLine();
System.out.println(" First letter: " + sentence.charAt(0) + "\n Third letter: " + sentence.charAt(2) + "\n Sentence: " + sentence);
	

System.out.println("Type a sentence: ");
String sentence = input.nextLine();
System.out.println("Is there a Bob in the sentence? \n" + sentence.contains("Bob") + "\n" + sentence);
*/
System.out.println("Name one: ");
String one = input.nextLine();
System.out.println("Name two: ");
String two = input.nextLine();
if (one.compareTo(two)>0){System.out.println(two + " comes first alphabetically");}
else{System.out.println(one + " comes first alphabetically");}
	}

}
