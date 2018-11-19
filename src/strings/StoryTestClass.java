package strings;

import java.util.Scanner;

public class StoryTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in story: ");
		String story = input.nextLine();
		Story bob = new Story(story);
		System.out.println("Word count: " + bob.wordCount());
		System.out.println("First word: " + bob.firstWord());
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		System.out.println(word + " appears " + bob.find(word) + " times in the story");
		System.out.println("Enter a phrase to replace: ");
		String phrase = input.nextLine();
		System.out.println("What do you want to replace it with?");
		String phrase2 = input.nextLine();
		bob.replace(phrase, phrase2);
		System.out.println(bob.getStory());
	}
}
