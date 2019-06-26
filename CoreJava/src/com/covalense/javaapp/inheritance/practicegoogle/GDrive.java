package com.covalense.javaapp.inheritance.practicegoogle;

import lombok.extern.java.Log;

@Log
public class GDrive extends Google {
	void shareDocument() {
		log.info("sharing document using google drive");
		log.info("We can share upto 5GB");
	}
}
