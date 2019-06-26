package com.covalense.javaapp.inheritance.practicegoogle;

import lombok.extern.java.Log;

@Log
public class Gmail extends Google {
	void shareDocument() {
		log.info("sharing document using Gmail");
		log.info("We can share upto 25MB");

	}
}
