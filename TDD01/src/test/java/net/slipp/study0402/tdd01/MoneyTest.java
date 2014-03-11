package net.slipp.study0402.tdd01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MoneyTest extends TestCase
{
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar ���Ѱ� = five.times(2);
		assertEquals(10, ���Ѱ�.amount);
		Dollar ���Ѱ�2 = five.times(3);
		assertEquals(15,���Ѱ�2.amount);
	}
}
