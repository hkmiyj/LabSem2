public class Faculty {
	private int capacity = 1000;
	private String[] firstName = new String[capacity];
	private String[] lastName = new String[capacity];
	private double[] salary = new double[capacity];
	private String[] rank = new String[capacity];
	private double totalSalary;
	private double average;
	public Professor associate = new Professor();
	public Professor assistant = new Professor();
	public Professor full = new Professor();

	// Constructor
	public Faculty() {
	}

	// Constructor based on size
	public Faculty(int size) {
		setCapacity(size);
	}

	public void setCapacity(int size) {
		this.capacity = size;
	}

	public void addMembers(String firstName, String lastName, double salary, String rank, int i) {
		this.firstName[i] = firstName;
		this.lastName[i] = lastName;
		this.salary[i] = salary;
		this.rank[i] = rank;
	}

	public void sortRank() {
		for (int j = 0; j < capacity; j++) {
			if (rank[j].equals("associate")) {
				associate.addPerson(salary[j]);
			} else if (rank[j].equals("assistant")) {
				assistant.addPerson(salary[j]);
			} else if (rank[j].equals("full")) {
				full.addPerson(salary[j]);
			}
		}
	}

	// Calculate total salary for all faculty
	public double getTotalSalary() {
		for (int x = 0; x < capacity; x++) {
			this.totalSalary += salary[x];
		}
		return this.totalSalary;
	}

	// Calculate average for all faculty
	public double getAvergeSalary() {
		this.average = this.totalSalary / capacity;
		return average;
	}
}