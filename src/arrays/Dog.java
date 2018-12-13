package arrays;

public class Dog {
	private String name;
	private int siblings;
	private int age;

	public Dog() {
		name = " ";
		age = 0;
		siblings = 0;
	}

	public Dog(String name2, int siblings2, int age2) {
		name = name2;
		siblings = siblings2;
		age = age2;
		if (siblings < 0) {
			siblings = 0;
		}
		if (age < 0) {
			age = 0;
		}
	}

	public void setAge(int age3) {
		age = age3;
	}

	public void setSiblings(int siblings3) {
		siblings = siblings3;
	}

	public void setName(String name3) {
		name = name3;
	}

	public int getAge() {
		return age;
	}

	public int getSiblings() {
		return siblings;
	}

	public String getName() {
		return name;
	}
}
