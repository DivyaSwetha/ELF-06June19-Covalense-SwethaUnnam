package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;

@Log
public class TestPeriod {

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(1996, 03, 31);
		LocalDate b = LocalDate.now();

		Period p = Period.between(d, b);
		
		int total = p.getYears() * 365 + p.getMonths() * 30 + p.getDays();
		log.info("" + total);

	}

}
