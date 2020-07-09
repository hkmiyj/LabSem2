public class Student extends Person {
	private String status;
	public final static String FRESHMAN = "1";
	public final static String JUNIOR = "2";
	public final static String SOPHOMORE = "3";
	public final static String SENIOR = "4";

	// Create constructor
	public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}

	// Choose the student year
	public String getStatus() {
		String studentYear = "";
		if (status == "1") {
			studentYear = "Freshman";
		} else if (status == "2") {
			studentYear = "Junior";
		} else if (status == "3") {
			studentYear = "Sophomore";
		} else if (status == "4") {
			studentYear = "Senior";
		} else {
			studentYear = "";
		}
		return studentYear;
	}

	// Print output
	public String toString() {
		return super.toString() + "\nStatus: Student(" + getStatus() + ")";
	}
}
