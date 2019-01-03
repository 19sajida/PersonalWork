package designingClasses;

public class Employee {
	private double wage;
	private double years;

	public Employee() {
		wage = 7.25;
		years = 0.0;
	}

	public Employee(double wage2, double years2) {
		wage = wage2;
		years = years2;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double newWage) {
		wage = newWage;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double newYears) {
		years = newYears;
	}

	public void raise() {
		wage = 1.1 * wage;
	}

	public String toString() {
		return ("wage: " + wage + " years of experience: " + years);
	}

	public boolean equals(Employee bob) {
		if (this.toString().equals(bob.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public Employee clone() {
		return new Employee(wage, years);
	}
}
