package com.covalense.javaapp.annotations;

import lombok.extern.java.Log;

@Log
public class Mouse {

	void click() {
		log.info("I am a click()");
	}

	@Deprecated
	void scroll() {
		log.info("I am a scroll()");

	}

	void doubleClick() {
		log.info("I am a doubleClick()");

	}

	void doubleFingerScroll() {
		log.info("I am a doubleFingerScroll()");

	}
}