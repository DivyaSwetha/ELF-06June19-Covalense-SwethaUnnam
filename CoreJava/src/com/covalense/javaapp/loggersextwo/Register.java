package com.covalense.javaapp.loggersextwo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	
	private static final Logger loger = Logger.getLogger("AmazonShop");

	void connectDB() {
		loger.log(Level.SEVERE, "connect to DB");

	}

	void store() {
		loger.log(Level.SEVERE, "Stored in db");

	}
}
