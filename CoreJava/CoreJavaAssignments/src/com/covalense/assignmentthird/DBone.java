package com.covalense.assignmentthird;

import lombok.extern.java.Log;

@Log
public class DB1 {

	void dispaly(Product a[]) {
		for (int i = 0; i <= a.length - 1; i++) {
			log.info("Name is: " + a[i].getName());
			log.info("Cost is: " + a[i].getCost());
			log.info("Brand is: " + a[i].getBrand());
			log.info("********************************");
		}
	}
}
