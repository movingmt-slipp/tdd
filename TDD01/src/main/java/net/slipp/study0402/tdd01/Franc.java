package net.slipp.study0402.tdd01;

public class Franc extends Money {	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int mu1tiplier) {
		return new Franc(amount * mu1tiplier, currency);
	}

}
