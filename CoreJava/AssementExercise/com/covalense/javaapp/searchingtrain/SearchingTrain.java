package com.covalense.javaapp.searchingtrain;

import lombok.extern.java.Log;

@Log
public class SearchingTrain {
	public void trainDetails() {
		log.info("Train number: 1234");
		log.info("Train name: ChennaiExpress");
		log.info("Platform number : 4");
		log.info("Boarding location: Chennai");
		log.info("lodging location: Madras");
	}

	public void search(int trainNumber) {
		log.info("Searching train with number");
		if(trainNumber==1234) {
			trainDetails();
		}else {
			log.info("Train details not found");
		}

	}

	public void search(String name) {
		log.info("Searching train with name");
		if(name=="chennai Express") {
			trainDetails();
		}else {
			log.info("Train details not found");
		}

	}
}
