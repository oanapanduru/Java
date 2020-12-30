package characterExercises;

public class MyChar {
	private char ch;

	MyChar(char ch) {
		this.ch = Character.toLowerCase(ch);
	}

	char getCharacter() {
		return this.ch;
	}

	void print() {
		System.out.println(this.ch);
	}

	boolean isVowel() {
		if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i' || this.ch == 'o' || this.ch == 'u') {
			return true;
		} else {
			return false;
		}

	}

	boolean isDigit() {
		if (this.ch >= 48 && this.ch <= 57) {
			return true;
		} else {
			return false;
		}
			
	}

		boolean isConsonante() {
			boolean testing = isVowel();
			boolean testing2 = isAlphabet();
			if (testing == false && testing2 == true) {
				return true;
			}
			else {
				return false;
			}
		}

		boolean isAlphabet() {
			if (this.ch >= 97 && this.ch <= 122) {
				return true;
			} else {
				return false;
			}
		}

		static void alphabet() {
			for (char i = 97; i <= 122; i++) {
				System.out.println(i);
			}
		}

		static void alphabetUpper() {
			for (char i = 65; i <= 90; i++) {
				System.out.println(i);
			}
		}


	}


