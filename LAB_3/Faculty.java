public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	// create constructor
	public Faculty(String name, String address, String phoneNumber, String emailAddress, String Office, double salary,
			String officeHours, String rank, int year, int month, int day) {
		super(name, address, phoneNumber, emailAddress, Office, salary, year, month, day);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRanks() {
		return rank;
	}

	// Print output
	public String toString() {
		return super.toString() + "\nOffice Hours: " + getOfficeHours() + "\nRank: " + getRanks();
	}

}
