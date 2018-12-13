package arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random numbers = new Random();
ArrayList<Rectangle> array = new ArrayList<Rectangle>();
int max = 100;
int min = 40;
for (int counter = 0; counter<20; counter++) {
	int length = min + numbers.nextInt(max-min+1);
	int width = min + numbers.nextInt(max-min+1);
	array.add(new Rectangle (length, width));
}
for (int counter2 = 0; counter2<20; counter2++) {
	System.out.println(array.get(counter2).area());
}
for (int counter3 = array.size()-1; counter3>=0; counter3--) {
	if (array.get(counter3).getLength()>60) {
		array.remove(counter3);
	}
}
System.out.println();
for (int counter4 = 0; counter4<array.size(); counter4++) {
	System.out.println(array.get(counter4).area());
}
	}

}
