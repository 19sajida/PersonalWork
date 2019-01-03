package designingClasses;

public class Student {
	private String name;
	private int grade;

	public Student() {
		name = "";
		grade = 0;
	}

	public Student(String xName, int xGrade) {
		name = xName;
		grade = xGrade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String xName) {
		name = xName;
	}

	public void setGrade(int xGrade) {
		grade = xGrade;
	}
}
