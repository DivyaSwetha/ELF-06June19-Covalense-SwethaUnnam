package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class NumbersThread implements Runnable {

	String name;

	public NumbersThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		log.info(name + "--->Started");
		for (int i = 1; i <= 10; i++) {
			log.info("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info(name + "--->completed");

	}
}
