package com.covalense.javaapp.loggersexone;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MakePayment {
	
	private static final Logger loger = Logger.getLogger("Amazon");

	void pay() {
		loger.log(Level.SEVERE, "Hi it is a severe message from pay");
		loger.log(Level.WARNING, "Hi it is a WARNING msg from pay");
	}
}
