package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class Grades {

	public static void main(String[] args) {
		double percentage = 90;
		
		if (percentage >= 70) {
			log.info("A grade with distinction");
		} else if (percentage >= 60) {
			log.info("A grade");
		} else if (percentage >= 50) {
			log.info("B grade");
		} else if (percentage >= 40) {
			log.info("C grade");
		} else {
			log.info("failed");
		}
	}

}
