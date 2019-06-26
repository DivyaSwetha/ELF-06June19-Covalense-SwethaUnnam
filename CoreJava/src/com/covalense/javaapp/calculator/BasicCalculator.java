package com.covalense.javaapp.calculator;

import lombok.extern.java.Log;

@Log
public class BasicCalculator {
	static void add(int a, int b) {
		log.info("Addition is: " + a + b);
	}

	static void sub(int a, int b) {
		log.info("result is: " + (a - b));
	}

	static void mul(int a, int b) {
		log.info("result is: " + (a * b));
	}

	static void div(int a, int b) {
		log.info("result is: " + (a / b));
	}

	public static void main(String[] args) {

		add(5, 3);
		sub(3, 2);
		mul(5, 2);
		div(16, 2);
	}

}
