package mathOperators;
import java.util.Scanner;
public class PracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int minutes = 0;
int seconds = 0;
int minute1 = 0;
int songs = 0;
int average = 0;
int seconds2 = 0;
int minute2 = 0;
System.out.println("How many songs are there?");
songs = input.nextInt();
System.out.println("How many minutes are there in the total length of songs?");;
minutes = input.nextInt();
System.out.println("How many seconds are remaining in the total length of songs?");
seconds = input.nextInt();
minute1 = (60*minutes);
average = ((minute1+seconds)/songs);
minute2 = ((int) (average/60));
seconds2 = (average%60);
System.out.println("The average length is " + minute2 + " minutes" + " and " + seconds + " seconds.");
	}

}
