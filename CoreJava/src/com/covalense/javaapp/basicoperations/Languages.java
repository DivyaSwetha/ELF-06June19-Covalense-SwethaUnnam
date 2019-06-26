package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class Languages {

	public static void main(String[] args) {
		
		int languageCode = 1;
		
		switch (languageCode) {
		case 1:
			log.info("Telugu");
			break;
		case 2:
			log.info("Kannada");
			break;
		case 3:
			log.info("English");
			break;
		case 4:
			log.info("Tamil");
			break;
		case 5:
			log.info("Malayalam");
			break;
		default:
			log.info("Invalid option");
			break;
		}
	}

}
