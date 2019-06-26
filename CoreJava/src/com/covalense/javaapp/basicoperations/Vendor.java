package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class Vendor {

	public static void main(String[] args) {
		int price = 50;
		switch (price) {
		case 10:
			log.info("Lays");
			break;
		case 20:
			log.info("KurKure");
			break;
		case 50:
			log.info("Dairy Milk");
			break;
		default:
			log.info("Invalid option");
			break;
		}
	}

}
