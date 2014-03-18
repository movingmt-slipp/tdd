package net.slipp.study0402.tdd01;

public class Sum implements Expression{
	public Expression augend;
	public Expression addend;
	
	public Sum(Expression augned, Expression addend) {
		this.augend = augned;
		this.addend = addend;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	@Override
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	public Expression times(int multiplier) {
		return new Sum(augend.times(multiplier), addend.times(multiplier));
	}
}
