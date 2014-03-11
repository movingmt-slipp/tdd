package net.slipp.study0402.tdd01;


public class Dollar
{

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int mu1tiplier) {
		return new Dollar(amount * mu1tiplier);
	}

}
