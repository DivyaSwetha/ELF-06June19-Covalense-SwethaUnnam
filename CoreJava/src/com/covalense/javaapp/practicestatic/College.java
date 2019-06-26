package com.covalense.javaapp.practicestatic;

import lombok.extern.java.Log;

@Log
public class College {
	/* final */ static Student s = new Student();

	void teach() {
		log.info("I am a Teach() in College Class");
	}
}
