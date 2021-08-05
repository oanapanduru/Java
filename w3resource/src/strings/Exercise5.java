package strings;

public class Exercise5 {
	 public static void compareStrings(String first, String second) {
		 if(first.equals(second)) {
			 System.out.println("they are equal");
		 }
		 else {
			 System.out.println("they are not equal");
		 }
	 }
	 
	 public static void compareStringsCompareTo(String first, String second) {
		 int compare = first.compareTo(second);
		 if(compare < 0) {
			 System.out.println("first is less than second");
		 }
		 else if (compare == 0) {
			 System.out.println("they are equal");
		 }

		 else  if(compare >0){
			 System.out.println("first is bigger than second");
		 }
	 }
	 
	 public static void compareCharByChar(String first, String second) {
		 boolean equal = false;
		 if(first.length()==second.length()) {
			 for(int i =0; i<first.length(); i++) {
				 if(first.charAt(i)==second.charAt(i)) {
					 equal = true;
					 break;
					 
				 }
				 
			 }
			 if(equal) {
				 System.out.println("they are equal");
			 }
			 else {
				 System.out.println("they are not equal");
			 }
		 }
		 else {
			 System.out.println("they are not equal");
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareStrings("hello", "hello");
		compareStringsCompareTo("This is Exercise 1", "This is Exercise 2");
		compareCharByChar("hello","hello");
	}
}
