package net.slipp.study0402.tdd01;

public interface Expression {

	Money reduce(Bank bank, String to);

	Expression plus(Expression addend);

	
}
