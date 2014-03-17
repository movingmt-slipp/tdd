package net.slipp.study0402.tdd01;

public class Money {

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int mu1tiplier) {
		return new Money(amount * mu1tiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public String currency() {
		return currency;
	}

	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
	
	
}
