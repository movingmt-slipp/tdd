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
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}
	
	
}
