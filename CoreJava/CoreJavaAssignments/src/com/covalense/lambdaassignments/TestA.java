package com.covalense.lambdaassignments;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		Sum s = (a, b) -> a + b;
		int i = s.add(5, 1);
		log.info("Sum is: " + i);
	}

}
