package hackerRankExercises;

public class DayOfTheProgrammer {

	// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

	public static String dayOfProgrammer(int year) {
		String result = "";
		/*
		 * if (year == 1918) { //26.09. } else if (year % 4 == 0) { if( year%100 ==0 &&
		 * year % 400 != 0 && year<1918) { result = (256 - 243) + ".09." + year; } else
		 * { result = (256 - 244) + ".09." + year; } } else { result = (256 - 243) +
		 * ".09." + year; }
		 */
		if(year > 1918) {
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				result = (256 - 244) + ".09." + year;
			} else {
				result = (256 - 243) + ".09." + year;
			}
		} else if(year == 1918) {
			result = (256 - 244+14) +".09.1918";
		} else {
			if(year % 4 == 0) {
				result = (256 - 244) + ".09." + year;
			} else {
				result = (256 - 243) + ".09." + year;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfProgrammer(1800));
	}

}
