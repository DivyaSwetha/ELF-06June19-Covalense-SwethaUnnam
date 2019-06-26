package com.covalense.javaapp.threads;

public class Browser extends Thread {
	PVR ref;

	Browser(PVR p) {
		this.ref = p;
	}

	@Override
	public void run() {
		ref.book();
	}
}
