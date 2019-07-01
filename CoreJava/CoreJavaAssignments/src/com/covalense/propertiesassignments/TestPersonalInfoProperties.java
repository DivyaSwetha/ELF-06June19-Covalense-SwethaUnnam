package com.covalense.javaapp.propertiesassignments;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestPersonalInfoProperties {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("Personal_info.properties");

			Properties p = new Properties();
			p.setProperty("Name", "Swetha");
			p.setProperty("ContactNumber", "9876543210");
			p.setProperty("Address", "BTM Layout");
			p.setProperty("Company", "Covalense");
			p.setProperty("email", "swetha@gmail.com");
			
			p.store(fout, "Personal details");
			
			log.info("created the file");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
