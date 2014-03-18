package net.slipp.study0402.tdd01;

public class Sum implements Expression{
	public Money augend;
	public Money addend;
	
	public Sum(Money augned, Money addend) {
		this.augend = augned;
		this.addend = addend;
	}

	public Money reduce(String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}
}
