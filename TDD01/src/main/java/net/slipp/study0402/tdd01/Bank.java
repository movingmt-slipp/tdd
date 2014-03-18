package net.slipp.study0402.tdd01;

public class Bank {

	public Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}

}
