package designingClasses;

public class Phone {
	private static int companyProductNumber = 1000;
	private int productNumber;
	private int myNumber;
	private static final int maxMinutes = 10000;
	private int minutesUsed;

	public Phone(int number, int minutes) {
		companyProductNumber++;
		productNumber = companyProductNumber;
		myNumber = number;
		minutesUsed = minutes;
	}

	public void makeCall(int minutes2) {
		minutesUsed = minutesUsed + minutes2;
	}

	public int timeRemaining() {
		int left = maxMinutes - minutesUsed;
		return left;
	}

	public void reset() {
		minutesUsed = 0;
	}
	public String toString(){
		return ("number: " + myNumber + " minutes used: " + minutesUsed);
	}
	public Phone clone(){
		return new Phone(myNumber, minutesUsed);
	}
}
