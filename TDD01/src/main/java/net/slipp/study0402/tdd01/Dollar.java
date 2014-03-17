package net.slipp.study0402.tdd01;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int mu1tiplier) {
		return new Dollar(amount * mu1tiplier, currency);
		
	}

}
