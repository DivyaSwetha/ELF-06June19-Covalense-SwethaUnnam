package com.covalense.javaapp.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOppTest {
	private StringOpp st = new StringOpp();

	@Test
	public void testStringCharCount() {
		int expected = 5;
		int actual = st.stringCharCount("Ramya");
		assertEquals(expected, actual);

	}

	@Test(expected = NullPointerException.class)
	public void testStringCharCountForException() {
		st.stringCharCount(null);
	}

}
