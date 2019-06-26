package com.covalense.javaapp.loggersexone;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CancelPayment {
	
	private static final Logger loger=Logger.getLogger("Amazon");
	
	void cancel() {
		loger.log(Level.SEVERE, "Hi it is a severe message from cancel");
		loger.log(Level.WARNING, "Hi it is a WARNING msg from cancel");
	}

}
