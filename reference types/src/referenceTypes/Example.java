package referenceTypes;

public class Example {

	public static void main(String[] args) {
		String name = "mama tata";
		for( int i = 0; i<name.length(); i++) {
			if(name.charAt(i)== 'a'|| name.charAt(i)=='e') {
				System.out.println(i);
			}
		}

	}

}
