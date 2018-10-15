package objectOrientedProgramming;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		System.out.println(bob.getHours());
		bob.setHours(35);
		System.out.println(bob.getHours());
		System.out.println(bob.getRate());
		bob.setRate(7.45);
		System.out.println(bob.getRate());
		System.out.println(bob.payCheck());
		bob.raise(1.0);
		System.out.println(bob.getRate());

		bob = new Worker(20, 9.0);
		System.out.println(bob.getHours());
		bob.setHours(35);
		System.out.println(bob.getHours());
		System.out.println(bob.getRate());
		bob.setRate(7.45);
		System.out.println(bob.getRate());
		System.out.println(bob.payCheck());
		bob.raise(1.0);
		System.out.println(bob.getRate());
	}

}
