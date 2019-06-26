package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class Largest {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		if (a > b) {
			log.info("a is greater than b");
		} else {
			log.info("b is greater than a");
		}

	}

}
