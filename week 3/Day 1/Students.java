package week3day1;

public class Students {

	public void getStudentInfo(int id) {
		
	}
	public void getStudentInfo1() {
		int id=156;
		String name="sasi";
		System.out.println("The name of the student with ID :"+name+" and "+id);
		
	}
	public void getStudentInfo2() {
		String email="Sachithra.devi1@gmail.com";
		int phonenumber=123456789;
		System.out.println("Student email and phonenumber :"+email+" and "+phonenumber);
		
	}
	public static void main(String[] args) {
		Students s =new Students();
	s.getStudentInfo(15);
	s.getStudentInfo1();
	s.getStudentInfo2();

	}
}


