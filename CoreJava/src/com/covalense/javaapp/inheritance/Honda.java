package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public abstract class Honda {
	void engine() {
		log.info("I am an engine method");
	}

	abstract void design();
}
