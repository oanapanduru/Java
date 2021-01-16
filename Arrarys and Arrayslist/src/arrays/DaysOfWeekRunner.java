package arrays;

public class DaysOfWeekRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Monday", "Tuedsay", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		DaysOfWeek days = new DaysOfWeek(daysOfWeek);
		System.out.println("the day having most letters in its name is: " + days.getTheLongest());
		days.printReverseDays();

	}

}
