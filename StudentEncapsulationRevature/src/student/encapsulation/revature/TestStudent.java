package student.encapsulation.revature;

public class TestStudent {
	public static void main(String[] args) {
		// Create an instance of Student
		Student student = new Student();
		
		// Set the fields using setter methods
		student.setstudentId(365);
		student.setstudentName("John Doe");
		student.setcollegeName("Revature University");
		student.setaddress("55 Coding Avenue, Somewhere, USA");
		
		// Get the fields using Getter methods and print them
		System.out.println("Student ID:  " + student.getstudentId());
		System.out.println("Student Name:  " + student.getstudentName());
		System.out.println("College Name:  " + student.getcollegeName());
		System.out.println("Address:  " + student.getaddress());
	}
}
