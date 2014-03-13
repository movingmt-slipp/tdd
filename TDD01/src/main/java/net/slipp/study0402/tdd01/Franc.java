package net.slipp.study0402.tdd01;


public class Franc
{

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int mu1tiplier) {
		return new Franc(amount * mu1tiplier);
	}

	public boolean equals(Object object){
		Franc dollar = (Franc) object;
		return amount == dollar.amount;
	}
}
