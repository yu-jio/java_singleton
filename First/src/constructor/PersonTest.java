package constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("조영현");
		person1.setGender('여');
		System.out.println(person1.name+' '+person1.getGender());
	}
}
