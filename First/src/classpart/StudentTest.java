package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student();
		studentAhn.setStudentName("유지오");
		Student student1 = new Student();
		
		System.out.println(studentAhn.getSerialNum());
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.studentID);
		System.out.println(student1.studentID);
	}

}
