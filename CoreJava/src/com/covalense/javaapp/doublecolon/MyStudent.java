package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class MyStudent {
	void calculateAvg(int a, int b, int c) {
		double r = (a + b + c) / 3.0;
		log.info("average is: " + r);
	}

	int calculateFact(int a) {
		int fact = 1;
		for (int i = 0; i <= 1; i++) {
			fact = fact * 1;
		}
		return fact;
	}
}
