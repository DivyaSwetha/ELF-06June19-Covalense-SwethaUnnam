package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import lombok.extern.java.Log;

@Log
public class TestDate {

	public static void main(String[] args) {

		LocalDate a = LocalDate.now();
		log.info("Current day in month: " + a.getDayOfMonth());
		log.info(" which Day of year: " + a.getDayOfYear());
		log.info(" Current month value: " + a.getMonthValue());
		log.info("Current year: " + a.getYear());
		log.info("Day of week: " + a.getDayOfWeek());
		log.info("length of year: " + a.lengthOfYear());
		log.info("length of year: " + a.isLeapYear());
		
		LocalDate b=LocalDate.of(2019,03, 31);
		log.info(" "+b.getDayOfWeek());
		



		

	}

}
