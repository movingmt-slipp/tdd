package net.slipp.study0402.tdd01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MoneyTest extends TestCase
{
	public void testMultiplication() {
		Money five = new Money(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
