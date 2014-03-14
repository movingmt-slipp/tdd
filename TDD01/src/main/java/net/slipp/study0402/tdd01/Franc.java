package net.slipp.study0402.tdd01;

public class Franc extends Money {

	public Franc(int amount) {
		this.amount = amount;
		currency = "CHF";
	}

	public Money times(int mu1tiplier) {
		return new Franc(amount * mu1tiplier);
	}

}
