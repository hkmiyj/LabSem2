public class Person {
	public String name;
	public String address;
	public String phoneNumber;
	public String emailAddress;

	// Create constructor
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
		this.emailAddress = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	// Print output
	public String toString() {
		return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
				+ "\nEmail Address: " + getEmailAddress();

	}
}
