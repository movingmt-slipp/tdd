package net.slipp.study0402.tdd01;


public class Dollar
{

	private int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int mu1tiplier) {
		return new Dollar(amount * mu1tiplier);
	}

	public boolean equals(Object object){
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}
