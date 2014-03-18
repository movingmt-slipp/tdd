package net.slipp.study0402.tdd01;

public class Sum implements Expression{
	public Money augend;
	public Money addend;
	
	public Sum(Money augned, Money addend) {
		this.augend = augned;
		this.addend = addend;
	}
}
