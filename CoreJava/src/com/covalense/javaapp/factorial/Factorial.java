package com.covalense.javaapp.factorial;

import lombok.extern.java.Log;

@Log
public class Factorial {

	static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		int res = fact(5);
		log.info("factorial of number is:" + res);
	}

}
