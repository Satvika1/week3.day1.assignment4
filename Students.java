package week3.day1.assignment4;

public class Students {
public static void studentsInfo(int id) {
	System.out.println("Student ID: \t"+id);
	
}
	public void studentInfo(int id, String name) {
		System.out.println("StudentID: \t"+id);
				
	}
	public void studentInfo(String email,long phNo) {
		System.out.println("Student Email ID:\t"+phNo);
		System.out.println("Student phone Number: \t"+phNo);
	}
	
		
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
Students std = new Students();
Students.studentsInfo(12);
std.studentInfo(12, "supriya");
std.studentInfo("sureshd12@gmail.com", 9943656373L);

	}

}
