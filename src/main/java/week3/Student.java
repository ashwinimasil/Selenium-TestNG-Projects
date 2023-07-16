package week3;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name is Ashwini Rajasekaran");
	}
	public void studentDept() {
		System.out.println("Student Dept is Physics Dept");
	}
	public void studentID() {
		System.out.println("Student ID is 01P7008");
	}
	
	public static void main(String[] args) {
		College coll = new College();
		coll.collegeCode();
		coll.collegeName();
		coll.collegeRank();
		
		Department Dept = new Department();
		Dept.deptname();
		
		Student stu =  new Student();
		stu.studentDept();
		stu.studentID();
		stu.studentName();
		
	}
	
}