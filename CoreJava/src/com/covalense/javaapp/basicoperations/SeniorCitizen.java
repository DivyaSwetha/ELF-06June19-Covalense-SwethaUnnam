package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class SeniorCitizen {

	public static void main(String[] args) {
		
		int age = 50;
		double ticketPrice = 100;
		double discount = 15.2;
		
		if (age >= 60) {
			double specPrice = ticketPrice - (ticketPrice * discount) / 100;
			log.info("Please pay:" + specPrice);
		}
		
		log.info("Please pay:" + ticketPrice);

	}

}
