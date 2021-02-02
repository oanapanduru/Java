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

		Person person = new Person();
		person.setName("John");
		person.setEmail("rhef@gmadl.chf");
		person.setPhoneNumber("76543456787");
		String value = person.toString();
		System.out.println(value);

		Employee employee = new Employee();
		employee.setName("Mike");
		employee.setEmail("fjsfsk@fjsslf.rif");
		employee.setPhoneNumber("578493398475");
		employee.setEmployer("Employer name");
		employee.setTitle("programmer");
		employee.setSalary(700);

		System.out.println(employee);
	}


}
