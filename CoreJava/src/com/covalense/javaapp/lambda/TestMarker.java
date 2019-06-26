package com.covalense.javaapp.lambda;

import lombok.extern.java.Log;

@Log
public class TestMarker {

	public static void main(String[] args) {

		Runnable r = () -> {
			log.info("I am running in marker");
			for (int i = 1; i <= 5; i++) {
				log.info("" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(r);
		t2.start();

	}

}
