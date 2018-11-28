package strings;

import java.util.Scanner;

public class BestFriendsTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BestFriends bob = new BestFriends();
		System.out.println("What is the name of your new friend?");
		String name4 = input.nextLine();
		System.out.print("What is the rank of your new best friend (rank 1-3)?");
		int rank = input.nextInt();
		System.out.println("Was the name changed? " + bob.changeFriend(name4, rank));
		String name = bob.getFriend1();
		System.out.println("First letter of name of best friend one? " + name.charAt(0));
		System.out.println("Length of best friend three's last name: " + bob.getLastLength());

	}

}
