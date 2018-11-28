package strings;

public class Story {
	private String story;

	public Story(String story2) {
		story = story2;
	}

	public String getStory() {
		return story;
	}

	public int wordCount() {
		int counter = 0;
		int words = 1;
		for (counter = 0; counter < story.length(); counter++) {
			if (story.charAt(counter) == ' ') {
				words++;	
			}
		}
		return words;
	}

	public String firstWord() {
		String first = story.substring(0, story.indexOf(" "));
		return first;

	}

	public int find(String words) {
		int counter = 0;
		int words2 = 0;
		words = words.toLowerCase();
		story = story.toLowerCase();
		for (counter = 0; counter <= story.length() - words.length(); counter++) {
			if (story.substring(counter, counter +words.length()).equals(words)) {
				words2++;
			}
		}
		return words2;
	}

	public void replace(String words, String newwords) {
		story = story.replaceAll(words, newwords);
	}

}