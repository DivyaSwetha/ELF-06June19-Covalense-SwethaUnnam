package com.covalense.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {
		log.info("Main started");
		
		Pen t1 = new Pen();
		t1.setName("FirstPen");
		t1.setPriority(10);
		t1.start();
		
		Pen t2 = new Pen();
		t2.setName("SecondPen");
		t2.setPriority(1);
		t2.start();
		
		Pen t3 = new Pen();
		t3.setName("ThirdPen");
		t3.setPriority(5);
		t3.start();
		
		log.info("Main ended");

	}//end of main

}
