package com.covalense.javaapp.loggersextwo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLogger {
	
	private static final Logger loger = Logger.getLogger("AmazonShop");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();

		try {
			FileHandler fh = new FileHandler("AmazonData.log", true);
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

			Register r = new Register();
			r.connectDB();
			r.store();

			Login l = new Login();
			l.validateUser();

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
