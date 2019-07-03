package com.covalense.assignmentssecond;

public class TestDriver {

	public static void main(String[] args) {
		Car c = new Audi();
		Car c1 = new Benze();
		Driver d = new Driver();
		d.recieve(c1);
	}

}
