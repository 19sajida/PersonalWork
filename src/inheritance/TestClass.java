package inheritance;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle(1, 2);
		System.out.println(bob.area());
		System.out.println(bob.perimeter());

		Trapezoid bob2 = new Trapezoid(1, 2, 3);
		System.out.println(bob2.area());
		System.out.println(bob2.perimeter());

		Parallelogram bob3 = new Parallelogram(1, 2, 3);
		System.out.println(bob3.area());
		System.out.println(bob3.perimeter());
		System.out.println(bob3.toString());

		Square bob4 = new Square(1);
		System.out.println(bob4.area());
		System.out.println(bob4.perimeter());
	}
}
