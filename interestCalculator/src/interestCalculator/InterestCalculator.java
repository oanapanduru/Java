package interestCalculator;

public class InterestCalculator {
	private int ammount;
	private float interest;
	private int years;

	InterestCalculator(int ammount, float interest, int years) {
		this.ammount = ammount;
		this.interest = interest;
		this.years = years;

	}

	float ammountWithInterest() {
		float ammountWithInterest = this.ammount + (this.ammount * this.interest * this.years);
		return ammountWithInterest;
	}
}
