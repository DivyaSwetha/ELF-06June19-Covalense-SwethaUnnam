package com.covalense.collectionsassignments;

import lombok.extern.java.Log;

@Log
public class AgeValidator {
	void validate(int a) throws InvalidAgeException {
		if (a < 18) {
			throw new InvalidAgeException();
		} else {
			log.info("Hi you are eligible for vote");
		}
	}
}
