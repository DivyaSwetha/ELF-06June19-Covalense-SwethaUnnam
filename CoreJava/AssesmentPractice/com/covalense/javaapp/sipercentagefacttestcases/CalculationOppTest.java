package com.covalense.javaapp.sipercentagefacttestcases;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculationOppTest {
	@Test
	public void simpleInterestTest() {
		int expected=100;
		int actual=new CalculationOpp().simpleInterest(100, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void percentageTest() {
		int expected=100;
		int actual=new CalculationOpp().percentage(100, 100, 100, 300);
		assertEquals(expected, actual);
	}
	
	@Test
	public void factorialTest() {
		int expected=2;
		int actual=new CalculationOpp().fact(2);
		assertEquals(expected, actual);
	}
}
