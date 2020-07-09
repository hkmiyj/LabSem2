public class Faculty {
	public Course[] courseList = new Course[3]; // store list of courses
	public int numberOfCourses = 0; // store current size of the list
	public String facultyName;

	// create a constructors
	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	// add course into the course list
	public void addCourse(Course course) {
		course.setFaculty(this);
		this.courseList[numberOfCourses] = course;
		numberOfCourses++;
	}

	// to print the output
	public String toString() {
		String returnString = "";
		returnString = returnString + "The courses that " + facultyName + " is teaching  : ";
		for (int i = 0; i < numberOfCourses; i++) {
			if (i == (numberOfCourses - 1)) {
				returnString = returnString + courseList[i].getCourseName() + " ";
				break;
			}
			returnString = returnString + courseList[i].getCourseName() + ",  ";
		}
		return returnString;
	}
}
