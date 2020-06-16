import java.io.*;

public class Question_12_24 {
	public static void main(String[] args) throws FileNotFoundException {

		File sfile = new File("Salary.txt");
		PrintWriter Output = new PrintWriter(sfile);
		if (sfile.exists()) {
			System.out.println("File has already created.");
		}
		String rank = "";
		double salary = 0;
		for (int i = 1; i <= 1000; i++) {
			Output.print("FirstName" + i + " LastName" + i + " ");
			rank = getRank();
			salary = getSalary(rank);
			Output.print(rank);
			Output.printf(" %.2f", salary);
			Output.println("");
		}
		Output.close();
	}

	// Method to generate random rank
	public static String getRank() {
		String rank = "";
		int randomRank = 1 + (int) (Math.random() * (3));
		if (randomRank == 1) {
			rank = "assistant";
		} else if (randomRank == 2) {
			rank = "associate";
		} else if (randomRank == 3) {
			rank = "full";
		}
		return rank;
	}

	// Method to generate random salary
	public static double getSalary(String rank) {
		double salary = 0;
		if (rank == "assistant") {
			salary = 50000 + (double) (Math.random() * ((80000 - 50000) + 1));
		} else if (rank == "associate") {
			salary = 60000 + (double) (Math.random() * ((110000 - 60000) + 1));
		} else if (rank == "full") {
			salary = 75000 + (double) (Math.random() * ((130000 - 75000) + 1));
		}
		return salary;
	}
}
