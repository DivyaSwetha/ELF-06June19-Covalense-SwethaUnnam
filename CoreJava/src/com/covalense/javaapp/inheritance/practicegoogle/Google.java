package com.covalense.javaapp.inheritance.practicegoogle;

import lombok.extern.java.Log;

@Log
public abstract class Google {
	void login() {
		log.info("Logging in");
	}

	abstract void shareDocument();
}
