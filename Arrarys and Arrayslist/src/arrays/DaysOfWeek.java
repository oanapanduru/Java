package arrays;

public class DaysOfWeek {
	private String days[];

	DaysOfWeek(String[] days) {
		this.days = days;
	}

	String getTheLongest() {
		String longest = "";
		for (String day : this.days) {
			if (day.length() > longest.length()) {
				longest = day;
			}

		}
		return longest;
}
	void printReverseDays() {
		for (int i = this.days.length - 1; i >= 0; i--) {
			System.out.println(this.days[i]);
		}
	}
}
