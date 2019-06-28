package com.covalense.javaapp.simpleinterest;

import lombok.extern.java.Log;

@Log
public class TestSimpleInterest {

	public static void main(String[] args) {
		SimpleInterest sp = (i, j, k) -> (i * j * k) / 100;
		double res = sp.getSimpleInterest(10, 10, 10);
		log.info("Simple Interest is: " + res);
	}

}
