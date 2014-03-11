package net.slipp.study0402.tdd01;


public class Money
{

	public int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public void times(int mu1tiplier) {
		amount *= mu1tiplier;
	}

}
