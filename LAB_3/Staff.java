public class Staff extends Employee {
	private String title = "Unknown";

	// create constructor
	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			int year, int month, int day, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, year, month, day);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	// Print output
	public String toString() {
		return super.toString() + "\nTitle: " + getTitle();
	}
}
