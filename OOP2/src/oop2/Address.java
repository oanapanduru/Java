package oop2;

public class Address {
	private String country;
	private String city;
	private String street;

	// creation
	public Address(String country, String city, String street) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return String.format("country - %s, city - %s, street - %s", country, city, street);
	}
}
