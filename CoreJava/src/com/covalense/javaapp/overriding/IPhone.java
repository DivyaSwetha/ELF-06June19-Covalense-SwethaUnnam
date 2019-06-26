package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class IPhone extends Phone {
	void says() {
		log.info("say i Love you");
	}
}
