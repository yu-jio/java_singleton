package constructor;

public class Person {
	String name;
	int height;
	double weight;
	private char gender;
	boolean married;
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
	public Person(String name) {
		this.name = name;
	}
}
