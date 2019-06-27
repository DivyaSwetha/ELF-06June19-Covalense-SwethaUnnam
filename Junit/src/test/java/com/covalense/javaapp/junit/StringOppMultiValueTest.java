package com.covalense.javaapp.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOppMultiValueTest {

	private StringOpp str=new StringOpp();
	private String name;
	private int value;

	public StringOppMultiValueTest(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "Ram", 3 }, { "Seetha", 6 }, { "Lakshman", 8 } };

		return Arrays.asList(obj);
	}

	@Test
	public void testStringCharCount() {
		int res = str.stringCharCount(name);
		assertEquals(value, res);
	}

}
