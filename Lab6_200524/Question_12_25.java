import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_25 {

	public static void main(String[] args) {

		try {
			// Create faculty that have 1000 members
			Faculty faculty = new Faculty(1000);

			// Read data from URL and insert data members on faculty
			URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());
			int i = 0;
			while (input.hasNext()) {
				String firstName = input.next();
				String lastName = input.next();
				String rank = input.next();
				double salary = input.nextDouble();
				faculty.addMembers(firstName, lastName, salary, rank, i);
				i++;

			}
			// Sort rank associate,assistant and full
			faculty.sortRank();

			// Display Output
			System.out.println("\tTotal Salary");
			System.out.println("-----------------------------------");
			System.out.printf("Assistant Professors: $ %.2f\n", faculty.assistant.getTotalSalary());
			System.out.printf("Associate Professors: $ %.2f\n", faculty.associate.getTotalSalary());
			System.out.printf("Full Professors     : $ %.2f\n", faculty.full.getTotalSalary());
			System.out.printf("All Faculty         : $ %.2f\n", faculty.getTotalSalary());

			System.out.println("\n\tAverage Salary");
			System.out.println("-----------------------------------");
			System.out.printf("Assistant Professors: $ %.2f\n", faculty.assistant.getAverage());
			System.out.printf("Associate Professors: $ %.2f\n", faculty.associate.getAverage());
			System.out.printf("Full Professors     : $ %.2f\n", faculty.full.getAverage());
			System.out.printf("All Faculty         : $ %.2f\n", faculty.getAvergeSalary());

		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("IO Errors");
		}
	}
}