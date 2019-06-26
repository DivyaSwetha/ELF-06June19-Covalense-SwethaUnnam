package com.covalense.assignmentssecond;

public class Gun {
	void count(BeforeShoot b) {
		if (b instanceof Round1) {
			b.bullets();
		} else if (b instanceof Round2) {
			b.bullets();
		} else if (b instanceof Round3) {
			b.bullets();
		}
	}
}
