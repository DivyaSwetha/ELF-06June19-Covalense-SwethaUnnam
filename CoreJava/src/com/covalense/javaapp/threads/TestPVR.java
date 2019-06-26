package com.covalense.javaapp.threads;

public class TestPVR {

	public static void main(String[] args) {
		PVR p = new PVR();
		
		Browser t1 = new Browser(p);
		t1.start();

		Browser t2 = new Browser(p);
		t2.start();
		

		Browser t3 = new Browser(p);
		t3.start();
	}

}
