package arrays;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee(" Jane", new int[] { 100, 99, 80, 95 });
		Employee employee2 = new Employee("Mark", new int[] { 100, 99, 87, 92 });
		Employee employee3 = new Employee(" Robert", new int[] { 100, 98 });
		employee.getNumberOfTarget();
		System.out.println(employee.getTotalOfTargets());
		System.out.println(employee.getMax());
		System.out.println(employee.getMin());
		employee.getMinAndMax();
		System.out.println(employee.getAverage());

		employee2.getNumberOfTarget();
		System.out.println(employee2.getTotalOfTargets());
		System.out.println(employee2.getMax());
		System.out.println(employee2.getMin());
		employee2.getMinAndMax();
		System.out.println(employee2.getAverage());

		employee3.getNumberOfTarget();
		System.out.println(employee3.getTotalOfTargets());
		System.out.println(employee3.getMax());
		System.out.println(employee3.getMin());
		employee3.getMinAndMax();
		System.out.println(employee3.getAverage());


	}

}
