package arrays;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 100, 98, 80, 95 };
		Student student = new Student(" Jane", marks);
		student.getNumberOfMarks();
		System.out.println(student.getTotalOfMarks());
		System.out.println(student.getMax());
		System.out.println(student.getMin());
		student.getMinAndMax();
		System.out.println(student.getAverage());

	}

}
