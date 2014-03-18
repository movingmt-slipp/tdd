package net.slipp.study0402.tdd01;

public class Money implements Expression {

	protected int amount;
	protected String currency;
	
	public Money reduce(Bank bank, String to){
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
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

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	public Expression times(int mu1tiplier) {
		return new Money(amount * mu1tiplier, currency);
	}
	
}

