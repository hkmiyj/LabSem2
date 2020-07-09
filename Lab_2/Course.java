public class Course {
	public Student[] classList = new Student[60]; // total number of student in the class
	public int numberOfStudents = 0;
	public Faculty faculty;
	public String courseName;

	// create a constructors
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public Course() {
		this.courseName = "";
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Faculty getFaculty() {
		return this.faculty;
	}

	public String getCourseName() {
		return this.courseName;
	}

	// To add Student in the class list
	public void addStudent(Student student) {
		classList[numberOfStudents] = student;
		numberOfStudents++;
	}

	// To print the output
	public String toString() {
		String returnString = "";
		returnString = returnString + "Student in " + courseName + " : ";
		for (int i = 0; i < numberOfStudents; i++) {
			if (i == (numberOfStudents - 1)) {
				returnString = returnString + classList[i].getStudentName();
				break;
			}
			returnString = returnString + classList[i].getStudentName() + ", ";
		}
		return returnString;
	}
}