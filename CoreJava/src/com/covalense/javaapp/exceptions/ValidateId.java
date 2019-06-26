package com.covalense.javaapp.exceptions;

import lombok.extern.java.Log;

@Log
public class ValidateId {
	void validate(int i) {
		try {
			if (i >= 10) {
				throw new InvalidId();
			} else {
				log.info(i + " is your id");
			}
		} catch (InvalidId e) {
			log.severe("" + e);
		}
	}
}
