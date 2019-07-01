package com.covalense.javaapp.propertiesassignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class TestPersonalInfoRead {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("Personal_info.properties");
			Properties pro = new Properties();
			pro.load(fin);

			String name = pro.getProperty("Name");
			String phone = pro.getProperty("ContactNumber");
			String email = pro.getProperty("email");
			String Company = pro.getProperty("Company");
			String Address = pro.getProperty("Address");


			log.info("Name is: " + name);
			log.info("Phone number is: "+phone);
			log.info("email is: "+email);
			log.info("Company is: "+Company);
			log.info("Address is: "+Address);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
