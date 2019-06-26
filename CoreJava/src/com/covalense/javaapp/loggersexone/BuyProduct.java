package com.covalense.javaapp.loggersexone;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	
	private static final Logger loger = Logger.getLogger("Amazon");

	void buy() {
		loger.log(Level.SEVERE, "Hi it is a severe message from buy");
		loger.log(Level.WARNING, "Hi it is a WARNING msg from buy");
	}
}
