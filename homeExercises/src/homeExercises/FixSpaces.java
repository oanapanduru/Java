package homeExercises;

public class FixSpaces {

	// TODO:Given a String s that contains multiple consecutive spaces.
	// Fix the String so that the spaces are correct - there should be no more than
	// one space between words.
	// Example: ‘This cat is very big’ print ‘This cat is very big’
	// Tips:
	// Create a new String
	// Loop over the characters of the String; best is a while loop;
	// If the characters is not space add it to the new String;
	// If the character is a space add it and create a new loop that increments the
	// current index
	// until the next character after current index is different than space;

	public static void fixSpaces(String s) {
		String newString[] = s.split(" ");
		String result = "";
		String temp[] = new String[newString.length];
		for (int i = 0; i < newString.length; i++) {
			if (!newString[i].isEmpty()) {
				result = result + newString[i] + " ";
				temp[i] = newString[i];
				// System.out.print("x");
			}
		}
		System.out.println(result);
	}

	public static void fixSpaces2(String s) {
		String result = "";
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) != 32) {
				result = result + s.charAt(i);
			}
			// i++;
			if (s.charAt(i) == 32) {
				result = result + s.charAt(i);
				while (i < s.length() && s.charAt(i) == 32  ) {
					System.out.println("in the second while, before incrementing: " + i);
					i++;
					System.out.println("in the second while, after incrementing: " + i);
				}
				System.out.println("after the second while, before decrementing: " + i);
				i--;
				System.out.println("after the second while, after decrementing: " + i);
			}
			System.out.println("last incrementing of i:  " + i);
			i++;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fixSpaces("This    cat    is  very   big");
		fixSpaces2("This    cat    is a very   big    fluffy            cat   ");
	}

}
