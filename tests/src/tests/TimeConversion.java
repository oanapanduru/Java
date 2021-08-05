package tests;

public class TimeConversion {

	public static String timeConversion(String s) {
		// Write your code here
		StringBuilder result = new StringBuilder();
		if (s.indexOf("AM") != -1) {
			if (s.substring(0, 2).equals("12")) {
				result.append("00");
				for (int i = 2; i < s.length() - 2; i++) {
					result.append(s.charAt(i));

				}
			} else {
				for (int i = 0; i < s.length() - 2; i++) {
					result.append(s.charAt(i));

				}
			}
		}
		if (s.indexOf("PM") != -1) {
			if (s.substring(0, 2).equals("12")) {
				result.append("12");
				for (int i = 2; i < s.length() - 2; i++) {
					result.append(s.charAt(i));
				}		
			}
			else {
				if (s.substring(0, 2).equals("01")) {
					result.append("13");
					for (int i = 2; i < s.length() - 2; i++) {
						result.append(s.charAt(i));
					}
				}
					if (s.substring(0, 2).equals("02")) {
						result.append("14");
						for (int i = 2; i < s.length() - 2; i++) {
							result.append(s.charAt(i));
						}
					}
						if (s.substring(0, 2).equals("03")) {
							result.append("15");
							for (int i = 2; i < s.length() - 2; i++) {
								result.append(s.charAt(i));
							}
						}
							if (s.substring(0, 2).equals("04")) {
								result.append("16");
								for (int i = 2; i < s.length() - 2; i++) {
									result.append(s.charAt(i));
								}
							}
								if (s.substring(0, 2).equals("05")) {
									result.append("17");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								
								if (s.substring(0, 2).equals("06")) {
									result.append("18");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								if (s.substring(0, 2).equals("07")) {
									result.append("19");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								if (s.substring(0, 2).equals("08")) {
									result.append("20");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								if (s.substring(0, 2).equals("09")) {
									result.append("21");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								if (s.substring(0, 2).equals("10")) {
									result.append("22");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								if (s.substring(0, 2).equals("11")) {
									result.append("23");
									for (int i = 2; i < s.length() - 2; i++) {
										result.append(s.charAt(i));
									}
								}
								
						}
			//System.out.println("PM");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(timeConversion("12:45:54PM"));
	}

}
