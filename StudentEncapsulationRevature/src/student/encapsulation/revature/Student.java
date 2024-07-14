package student.encapsulation.revature;

public class Student {
	private int studentId;
	private String studentName;
	private String collegeName;
	private String address;
	
	// Getter and Setter for Student Id
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	// Getter and Setter for Student Name
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	// Getter and Setter for College Name
	public String getcollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	// Getter and Setter for Address
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
}
