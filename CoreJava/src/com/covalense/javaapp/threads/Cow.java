package com.covalense.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Cow {

	synchronized void eat() {

		for (int i = 1; i <= 5; i++) {
			log.info("" + i);
			try {
				wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void leaveMe() {
		notifyAll();
	}

}
