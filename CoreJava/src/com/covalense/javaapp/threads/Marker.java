package com.covalense.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		log.info("I am running in marker");
		for (int i = 1; i <= 5; i++) {
			log.info("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//end of run

}
