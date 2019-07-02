package com.covalense.javaapp.jodadatetime;

import java.time.LocalDateTime;

import lombok.extern.java.Log;
@Log
public class TestLocalDatseTime {

	public static void main(String[] args) {
		LocalDateTime a=LocalDateTime.of(1996, 03, 31, 06, 32);
		log.info("My Birth date and time"+a);
		
		
	}

}
