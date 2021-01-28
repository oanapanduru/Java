package oop2;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Olive");
		student.setEmail("blabla");
		student.setPhoneNumber("637947538942");
		student.setYear(3);
		student.setCollege("University of X");

		System.out.println("name " + student.getName());
		System.out.println("email: " + student.getEmail());
		System.out.println("hone number: " + student.getPhoneNumber());
		System.out.println("year: " + student.getYear());
		System.out.println("college: " + student.getCollege());
	}

}
