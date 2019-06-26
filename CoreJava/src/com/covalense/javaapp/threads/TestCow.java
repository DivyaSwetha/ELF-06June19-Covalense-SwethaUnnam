package com.covalense.javaapp.threads;

public class TestCow {

	public static void main(String[] args) {

		Cow c = new Cow();

		Animal t1 = new Animal(c);
		t1.start();
		

		Animal t2 = new Animal(c);
		t2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		  c.leaveMe();
		 	}

}
