package com.covalense.javaapp.typeofobjects;

import lombok.extern.java.Log;

@Log
public class Validate {
	int cow;
	int dog;
	int lion;

	public void validate(Object[] aa) {
		
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] instanceof Cow) {
				cow++;
			} else if (aa[i] instanceof Dog) {
				dog++;
			} else
				lion++;
		}
		
		log.info("Number of cow objects are: " + cow);
		log.info("Number of dog objects are: " + dog);
		log.info("Number of lion objects are: " + lion);

	}
}
