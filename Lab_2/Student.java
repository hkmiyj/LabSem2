public class Student {
	public Course[] courseList = new Course[9999];
	public int numberOfCourses = 0;
	public String studentName;

	// create a constructors
	public Student(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	// to add course to courseList
	public void addCourse(Course course) {
		course.addStudent(this);
		courseList[numberOfCourses] = course;
		numberOfCourses++;
	}

	// To print the output
	public String toString() {
		String returnString = "";
		System.out.print(studentName + " Courses : ");
		for (int i = 0; i < numberOfCourses; i++) {
			if (i == (numberOfCourses - 1)) {// print only one course don't need coma
				returnString = returnString + courseList[i].getCourseName();
				break;
			}
			returnString = returnString + courseList[i].getCourseName() + ", ";// print more than one course need coma
		}
		return returnString;
	}
}
