package com.covalense.assignmentsfirst;

import lombok.extern.java.Log;

@Log
public class Primes {

	public static void main(String[] args) {
		int i = 11;
		boolean isprime;

		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0) {
				isprime = false;

				if (isprime) {
					log.info(i + " is a Prime");

				} else {
					log.info(i + " is not a prime");

				}
			}
		}
	}
}
