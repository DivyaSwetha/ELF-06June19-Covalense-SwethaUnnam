package com.covalense.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			log.info("" + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		String s = getName();
		log.info("" + s);

	}// end of run

}
