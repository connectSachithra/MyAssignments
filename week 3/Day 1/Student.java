package week3day1;

public class Student extends Department{

	public void studentName(){
		System.out.println("Student name is:Sasi");
	}
	public void studentDept() {
		System.out.println("Student Department is:Science");
	}
	public void studentId() {
		System.out.println("Student ID is:56489");

	}
public static void main(String[] args) {
	Student s=new Student();
	s.collageName();
	s.collageCode();
	s.collageRank();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
}
}
