package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Girl {

	void recieve(Phone p) {
		if (p instanceof MiPhone) {
			log.info("thank you brother");
		}
		if (p instanceof IPhone) {
			log.info("I Love you");
		}
	}
}
