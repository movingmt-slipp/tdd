package net.slipp.study0402.tdd01;

public class Franc extends Money {

	
	
	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int mu1tiplier) {
		return Money.franc(amount * mu1tiplier);
	}

}
