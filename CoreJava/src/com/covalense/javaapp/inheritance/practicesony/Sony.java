package com.covalense.javaapp.inheritance.practicesony;

import lombok.extern.java.Log;

@Log
public class Sony implements Printer {

	public void print() {
		log.info("I am a Print method");
	}

}
