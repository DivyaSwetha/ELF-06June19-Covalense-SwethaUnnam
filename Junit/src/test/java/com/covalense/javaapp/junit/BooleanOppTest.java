package com.covalense.javaapp.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanOppTest {

	BooleanOpp bo=new BooleanOpp();
	@Test
	public void testOddOrEven() {
		assertEquals(true, bo.oddOrEven(4));
		
	}

}
