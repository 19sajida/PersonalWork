package objectOrientedProgramming;

public class CatTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bob = new Cat();
		System.out.println(bob.birthday() + " years old after it's next birthday");
		System.out.println(bob.getSleep() + " hours");
		bob.sleepMore();
		System.out.println(bob.getSleep() + " hours + 1");
		bob.sleepLess();
		System.out.println(bob.getSleep() + " hours - 1 \n it does work");
	}

}
