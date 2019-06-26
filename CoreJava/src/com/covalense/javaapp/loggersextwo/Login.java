package com.covalense.javaapp.loggersextwo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Login {

	private static final Logger loger = Logger.getLogger("AmazonShop");

	void validateUser() {
		try {
			FileHandler f = new FileHandler("login.log", true);
			loger.addHandler(f);
			f.setFormatter(new SimpleFormatter());
			loger.log(Level.SEVERE, "validating user");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
