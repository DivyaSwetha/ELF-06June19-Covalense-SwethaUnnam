package com.covalense.javaapp.loggersexone;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestA {

	private static final Logger loger = Logger.getLogger("Rama");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.FINE);

		loger.addHandler(ch);

		loger.log(Level.SEVERE, "Hi it is a severe message");
		loger.log(Level.WARNING, "Hi it is a WARNING msg");
		loger.log(Level.INFO, "Hi it is a INFO msg");
		loger.log(Level.CONFIG, "Hi it is a CONFIG msg");
		loger.log(Level.FINE, "Hi it is a FINE msg");
		loger.log(Level.FINER, "Hi it is a FINER msg");
		loger.log(Level.FINEST, "Hi it is a FINEST msg");

	}

}
