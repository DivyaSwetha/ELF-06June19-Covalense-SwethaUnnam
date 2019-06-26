package com.covalense.collectionsassignments;

public class Validator {
	void validate(String p) {
		try {
			if (p.length() <= 4) {
				throw new InvalidNameException();
			} else {
				log.info("Hi " + p);
			}
		} catch (InvalidNameException e) {
			log.info(e);
		}
	}
}
