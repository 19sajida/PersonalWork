package objectOrientedProgramming;

public class GreeterTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greeter bob = new Greeter();
bob.sayHello();
int age = bob.getAge();
System.out.println(age);
bob.setAge(4);
	}

}
