public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;

	// create constructor
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			int d, int m, int y) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate(d, m, y);
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	// Print output
	public String toString() {
		return super.toString() + "\nOffice: " + getOffice() + "\nSalary: RM" + getSalary() + "\nDate Hired: "
				+ getDateHired();
	}
}