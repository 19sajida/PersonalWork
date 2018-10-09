package objectOrientedProgramming;

public class Greeter{
	//instance fields - data storage
	//constructors - methods for constructing the object
	//default constructor
	private int age;
public Greeter()	
{age = 0;}
public void sayHello()
{System.out.println("Hello");
		//Statements to initialize the state of the object)
}
public int getAge(){return age;}
public void setAge(int newAge){age = newAge;}
}