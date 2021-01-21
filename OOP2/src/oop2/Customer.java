package oop2;

public class Customer {
	// state of the object
	private String name;
	private Address address;

	// creating
	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	// operations

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("name - %s, address - %s", name, address);
	}
}
