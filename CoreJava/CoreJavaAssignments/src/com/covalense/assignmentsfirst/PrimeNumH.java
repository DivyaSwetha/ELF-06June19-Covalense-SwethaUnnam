package com.covalense.assignmentsfirst;

import lombok.extern.java.Log;

@Log
public class PrimeNum100 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				log.info(""+i);
			}
		}

	}
}
