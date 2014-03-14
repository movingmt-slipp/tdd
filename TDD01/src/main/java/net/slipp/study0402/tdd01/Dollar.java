package net.slipp.study0402.tdd01;

public class Dollar extends Money {

	public Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}

	public Money times(int mu1tiplier) {
		return new Dollar(amount * mu1tiplier);
	}

}
