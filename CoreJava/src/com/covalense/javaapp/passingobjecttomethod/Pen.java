package com.covalense.javaapp.passingobjecttomethod;

import lombok.extern.java.Log;

@Log
public class Pen {
	void open() {
		log.info("Open the Pen");
	}

	void write() {
		log.info("Write using Pen");
	}
}
