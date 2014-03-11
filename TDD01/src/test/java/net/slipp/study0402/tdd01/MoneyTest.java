package net.slipp.study0402.tdd01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MoneyTest extends TestCase
{
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar 培и高 = five.times(2);
		assertEquals(10, 培и高.amount);
		Dollar 培и高2 = five.times(3);
		assertEquals(15,培и高2.amount);
	}
}
