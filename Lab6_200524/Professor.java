public class Professor {
	private double total;
	private double average;
	private int count;

	public Professor() {
	}

	// Add new person
	public void addPerson(double salary) {
		increaseCount();
		calcTotalSalary(salary);
		calcAverage();
	}

	// To count how many people in specific rank
	public void increaseCount() {
		count++;
	}

	// To calculate total salary for specific rank
	public double calcTotalSalary(double salary) {
		this.total += salary;
		return this.total;
	}

	// To calculate average for specific rank
	public double calcAverage() {
		this.average = this.total / this.count;
		return this.average;
	}

	public double getTotalSalary() {
		return this.total;
	}

	public double getAverage() {
		return this.average;
	}

}