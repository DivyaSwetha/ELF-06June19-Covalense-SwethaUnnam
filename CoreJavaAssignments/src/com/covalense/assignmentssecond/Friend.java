package com.covalense.assignmentssecond;

import lombok.extern.java.Log;

@Log
public class Friend {
	void recieved(Gift g) {
		if (g instanceof Birthday) {
			log.info("Many more happy returns of the day");
		} else if (g instanceof Marriage) {
			log.info("Happy married life");
		}
	}
}
