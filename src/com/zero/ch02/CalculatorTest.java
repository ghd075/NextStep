package com.zero.ch02;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal;
	
	@Override
	protected void setUp() throws Exception {
		cal = new Calculator();
	}
	
	public void testAdd() {
		int result = cal.add(2, 1);
		assertEquals(3, result);
	}
	
	public void testSub() throws Exception {
		int result = cal.subtract(2, 1);
		assertEquals(1, result);
	}
	
	public void testMul() throws Exception {
		int result = cal.multiply(3, 2);
		assertEquals(6, result);
	}
}
