package com.covalense.assignmentssecond;

public class Driver {

	void recieve(Car c) {
		
		if (c instanceof Audi) {
			c.recieve();
		} else if (c instanceof Benze) {
			c.recieve();
		}
	}
}
