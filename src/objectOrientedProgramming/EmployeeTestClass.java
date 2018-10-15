package objectOrientedProgramming;

public class EmployeeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee sabrina = new Employee();
System.out.println(sabrina.getWage());
sabrina.setWage(7.45);
System.out.println(sabrina.getWage());
sabrina.raise();
System.out.println(sabrina.getWage());
	}

}
