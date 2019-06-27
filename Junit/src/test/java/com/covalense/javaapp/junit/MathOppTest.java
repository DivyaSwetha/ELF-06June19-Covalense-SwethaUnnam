package com.covalense.javaapp.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.javaapp.junit.MathOpp;

public class MathOppTest {

	private MathOpp m = new MathOpp();

	@Test
	public void testAddMethod() {
		assertEquals(60, m.add(10, 50));
	}

	@Test
	public void testDivMethod() {
		assertEquals(4, m.div(16, 4));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.div(16, 0);

	}

}
