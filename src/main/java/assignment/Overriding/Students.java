package assignment.Overriding;

public class Students {
	
	public void getStudentInfo(int id ) {
		System.out.println("int id alone" + id );
			}
	public int getStudentInfo(int id, String name ) {
		System.out.println("int id and string" + id + name);
		return id;
		
	}			
	public int getStudentInfo(int id, String name, String emailid, long phno ) {
		System.out.println("This method has id, name, emailid and phno" + id + name + emailid + phno);
		return  id;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu = new Students();
		stu.getStudentInfo(12345, "Ashwini");
		stu.getStudentInfo(1234);
		stu.getStudentInfo(23456, "Ashwini", "ashwinimasil@gmail.com", 923574456l);
	}
}




