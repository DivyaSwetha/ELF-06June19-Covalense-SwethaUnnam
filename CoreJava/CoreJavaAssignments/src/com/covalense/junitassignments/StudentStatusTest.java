package com.covalense.javaapp.junitassignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentStatusTest {
	
	private StudentStatus s = new StudentStatus();
	private StudentBean st;
	private double value;
	
	@Test
	public void testGetPopper() {
		double expected=92 ;
		double actual=st.getPercentage();
		assertEquals(expected, actual);
		
	}

}
