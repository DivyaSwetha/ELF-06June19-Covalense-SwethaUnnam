package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.extern.java.Log;

@Log
public class TestDateTime {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		log.info("" + t);

		LocalDate d = LocalDate.of(1996, 03, 31);
		log.info("Birth day is " + d);

		LocalTime l = LocalTime.of(06, 32);
		log.info("Birth Time is " + l);

		LocalDateTime a = LocalDateTime.of(1996, 03, 31, 06, 32);
		log.info("My Birth date and time is " + a);

	}

}
