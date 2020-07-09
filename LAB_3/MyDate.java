public class MyDate {
	private int year;
	private int month;
	private int day;

	// create constructor
	public MyDate(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// Print output
	public String toString() {
		return getDay() + "/" + getMonth() + "/" + getYear();
	}
}
