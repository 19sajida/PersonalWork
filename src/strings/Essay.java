package strings;

public class Essay {
	private String name;
	private String essay;

	public Essay() {
		String name = "";
		String essay = "";
	}

	public void setName(String name1) {
		name = name1;
	}

	public void setText(String text2) {
		essay = text2;
	}

	public String lastName() {
		int number = name.indexOf(' ') + 1;
		String last = name.substring(number);
		last = last.toUpperCase();
		return last;
	}

	public int firstName() {
		String length = name.substring(0, name.indexOf(' '));
		int number = length.length();
		return number;
	}

	public boolean x() {
		boolean letter = name.contains("x");
		return letter;
	}

	public int words() {
		int counter = 0;
		int number = 1;
		for (counter = 0; counter < essay.length(); counter++) {
			if (essay.charAt(counter) == ' ') {
				number++;
			}
		}
		return number;
	}
}
