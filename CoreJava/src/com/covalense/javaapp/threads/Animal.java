package com.covalense.javaapp.threads;

public class Animal extends Thread {

	Cow ref;

	Animal(Cow c) {
		ref = c;
	}

	@Override
	public void run() {
		ref.eat();
	}
}
