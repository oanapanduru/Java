package oop2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address address = new Address("Romania", "Bucharest", "street no.231");
		Customer customer = new Customer("Olive", address);
		System.out.println(customer);

	}

}
