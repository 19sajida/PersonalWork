package objectOrientedProgramming;

public class Cat {
	private double age;
	private double sleep;

	public Cat() {
		age = 5.0;
		sleep = 8.0;
	}

	public double getAge() {
		return age;
	}

	public double getSleep() {
		return sleep;
	}

	public void setAge(double age2) {
		age = age2;
	}

	public void setSleep(double sleep2) {
		sleep = sleep2;
	}

	public double birthday() {
		age = age + 1;
		return age;
	}

	public void sleepMore() {
		sleep = sleep + 1;
	}

	public void sleepLess() {
		sleep = sleep - 1;
	}
}
