package net.slipp.study0402.tdd01;

public abstract class Money {

	protected int amount;
	protected String currency;

	public abstract Money times(int multiplier);

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	public String currency() {
		return currency;
	}

	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
