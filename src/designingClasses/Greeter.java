package designingClasses;

public class Greeter {
	// instance fields - data storage
	// constructors - methods for constructing the object
	// default constructor
	private int age;
	private String name;

	public Greeter() {
		age = 0;
		name = "Bob";
	}

	public Greeter(String name2) {
		name = name2;
	}

	public void sayHello() {
		System.out.println("Hello");
		// Statements to initialize the state of the object)
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
}