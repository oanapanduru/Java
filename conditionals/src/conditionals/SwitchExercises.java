package conditionals;

import java.util.Scanner;

public class SwitchExercises {
	private int day;
	private int month;

	int getDay() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of the day (1-7):  ");
		this.day = scanner.nextInt();
		System.out.println("the number of the day that you have entered is " + day);
		return day;
		}

		int getMonth() {
			Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of the month (1-12):  ");
		this.month = scanner.nextInt();
		System.out.println("the number of the month that you have entered is " + month);
		return month;
	}
	

	void dayOfWeek() {
		switch (this.day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid input");
		}
	 }

	void isWorkingDay() {
		switch (this.day) {
		case 1:
			System.out.println("is a working day");
			break;
		case 2:
			System.out.println("is a working day");
			break;
		case 3:
			System.out.println("is a working day");
			break;
		case 4:
			System.out.println("is a working day");
			break;
		case 5:
			System.out.println("is a working day");
			break;
		case 6:
			System.out.println("is NOT a working day");
			break;
		case 7:
			System.out.println("is NOT a working day");
			break;
		default:
			System.out.println("invalid input");
		}

 }

	void isMonth() {
		switch (this.month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
