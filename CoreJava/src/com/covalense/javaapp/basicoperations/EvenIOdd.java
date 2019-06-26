package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class EvenIOdd {

	public static void main(String[] args) {
		int num = 2;

		if (num % 2 == 0) {
			log.info(num + " is even");

		} else {
			log.info(num + " is odd");
		}
	}

}
