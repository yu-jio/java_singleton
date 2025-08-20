package classpart;

public class Student {
	static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum ++;
		studentID = serialNum;
	}
	public static int getSerialNum() {
		int i=0;
//		studentName = "이지원";
		return serialNum;
	}
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name)
	{
		studentName = name;
	}
}