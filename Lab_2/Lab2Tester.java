public class Lab2Tester {
	public static void main(String args[]) {

		// Create 2 Course objects
		Course databaseSystem = new Course("Database System");
		Course dataStructure = new Course("Data Structure");

		// Create 2 Student objects
		Student peterJones = new Student("Peter Jones");
		Student kimSmith = new Student("Kim Smith");

		// Create 2 Faculty objects
		Faculty anneKennedy = new Faculty("Anne Kennedy");
		Faculty steveSmith = new Faculty("Steve Smith");

		// Assign both Peter Jones and Kim Smith to the Data Structures course
		peterJones.addCourse(dataStructure);
		kimSmith.addCourse(dataStructure);
		
		// Kim Smith to the Database Systems course
		kimSmith.addCourse(databaseSystem);
		
		// Anne Kennedy to both the Data Structures and Database Systems courses.
		anneKennedy.addCourse(databaseSystem);
		anneKennedy.addCourse(dataStructure);

		System.out.println(peterJones);
		System.out.println(dataStructure);
		System.out.println("Faculty teaching for Database System : " + databaseSystem.getFaculty().getFacultyName());
		System.out.println(anneKennedy);
	}
}
