package com.covalense.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class PVR {
	synchronized void book() {
		
		for (int i = 1; i <= 5; i++) {
			log.info("" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
