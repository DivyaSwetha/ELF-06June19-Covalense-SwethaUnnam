package com.covalense.javaapp.loggersexone;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	
	private static final Logger loger = Logger.getLogger("Amazon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			FileHandler fh = new FileHandler("MyData.log", true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);

			loger.severe("Hi it is a severe message"); // instead of using loger.log(Level.sever,msg) we can use
														// severe() directly
			loger.log(Level.WARNING, "Hi it is a WARNING msg");
			loger.log(Level.INFO, "Hi it is a INFO msg");
			loger.log(Level.CONFIG, "Hi it is a CONFIG msg");
			loger.log(Level.FINE, "Hi it is a FINE msg");
			loger.log(Level.FINER, "Hi it is a FINER msg");
			loger.log(Level.FINEST, "Hi it is a FINEST msg");
			BuyProduct b = new BuyProduct();
			b.buy();
			MakePayment m = new MakePayment();
			m.pay();

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
