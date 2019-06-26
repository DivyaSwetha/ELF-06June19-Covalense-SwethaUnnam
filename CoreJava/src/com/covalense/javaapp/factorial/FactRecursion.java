package com.covalense.javaapp.factorial;

import lombok.extern.java.Log;

@Log
public class FactRecursion {

	static int fact(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fact(num - 1);
	}

	public static void main(String[] args) {
		int a = 10;
		int res = fact(a);

		log.info("Factorial of " + a + " is: " + res);
	}

}
