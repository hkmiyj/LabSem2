public class Lab3Tester {

	public static void main(String[] args) {

		// Create person,student,employee,faculty and staff object
		Person person = new Person("Adam Hassan bin Hasnol", "Seremban, Negeri Sembilan", "0165556708",
				"Adamm40@yahoo.com");

		Student student = new Student("Amirul Hafizudin bin Hafizi ", "Jasin, Melaka", "0134567890",
				"Amirul_567@gmail.com", Student.SENIOR);

		Employee employee = new Employee("Nasharudin bin Aiman", "Taiping, Perak", "0144444890",
				"nashykun_31@hotmail.com", "AB776C", 5000, 15, 6, 2000);

		Faculty faculty = new Faculty("Afiq bin fairuz", "Pontian,Johor", "0134500890", "afiqah123@gmail.com",
				"BICI988C", 15000, "General", "second class", 16, 12, 2020);

		Staff staff = new Staff("Abu Bin Hassan", "Sungai Petani, Kedah", "0124567890", "Aburahh699@yahoo.com",
				"AB987ICI", 6000, 16, 7, 1998, "Doctor");

		// Invoke toString of person,student,employee,faculty and staff
		System.out.println(person.toString());
		System.out.println("\n" + student.toString());
		System.out.println("\n" + employee.toString());
		System.out.println("\n" + faculty.toString());
		System.out.println("\n" + staff.toString());
	}

}
