package com.covalense.javaapp.exceptions;

import java.io.IOException;

import com.covalense.javaapp.employee.DB1;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		PayTm p = new PayTm();
		log.info("main() started");
		try {
			p.book();
		} catch (ArithmeticException a) {
			log.info("exception caught in main");
		}
		try {
			p.getTicket();
		} catch (IOException e) {
			log.info("Exception caught in main()");
		}
		log.info("main method ended");
	}

}
