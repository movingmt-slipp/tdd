package net.slipp.study0402.tdd01;

public abstract class Money {
	
	protected int amount;
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	public abstract Money times(int multiplier);

	public static Franc franc(int amount) {
		return new Franc(amount);
	}
}
