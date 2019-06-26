package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class TestE {

	public static void main(String[] args) {
		String poem = " it is my password ";
		char c[] = poem.toCharArray();
		try {
			FileWriter fw = new FileWriter("password.txt", true);// if we write true old data will not be overridden
			fw.write(c);
			fw.flush(); // if we dont call flush() date will not be written into the file
			fw.close();
			log.info("Done!...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
