package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class DollarEuro {

	public static void main(String[] args) {
		double rupees = 1000;
		double dollar = 69.55;
		double euro = 78.60;
		
		log.info("1000=" + (rupees / dollar) + "dollars");
		log.info("1000=" + (rupees / euro) + "Euros");

	}

}
