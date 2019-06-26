package com.covalense.assignmentsfirst;

import lombok.extern.java.Log;

@Log
public class Prime1To100 {

	public static void main(String[] args) {
		boolean prime = true;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				log.info("" + i);
			}

		}
	}

}
