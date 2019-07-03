package com.covalense.assignmentssecond;

public class FuelLevel {
	void amount(Level l) {
		if (l instanceof Level1) {
			l.status();
		} else if (l instanceof Level2) {
			l.status();
		} else if (l instanceof Level3) {
			l.status();
		}

	}
}
