package com.covalense.javaapp.loggersthree;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestAnimal {

	private static final Logger loger = Logger.getLogger("Animal");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();

		try {
			FileHandler fh = new FileHandler("AnimalData.log", true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);

			loger.log(Level.SEVERE, "Hi it is a severe message");
			loger.log(Level.WARNING, "Hi it is a WARNING msg");
			loger.log(Level.INFO, "Hi it is a INFO msg");
			loger.log(Level.CONFIG, "Hi it is a CONFIG msg");
			loger.log(Level.FINE, "Hi it is a FINE msg");
			loger.log(Level.FINER, "Hi it is a FINER msg");
			loger.log(Level.FINEST, "Hi it is a FINEST msg");
			Animal c = new Cow();
			Animal l = new Lion();
			c.sound();
			l.sound();
			c.div(10, 2);
			l.div(16, 2);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
