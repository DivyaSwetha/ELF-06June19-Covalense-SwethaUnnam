package com.covalense.assignmentsfirst;

import lombok.extern.java.Log;

@Log
public class PrimeNum {

	public static void main(String[] args) {
		int i = 10;
		int count = 0;

		for (int j = 1; j <= 100; j++) {
			if (i % j == 0) {
				count++;
			}
		}

		if (count <= 2) {
			log.info(i + " is a prime number");
		} else {
			log.info(i + " is not a prime number");

		}
	}
}