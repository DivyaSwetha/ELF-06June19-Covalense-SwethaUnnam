package com.covalense.javaapp.organizationexabstraction;

import lombok.extern.java.Log;

@Log
public class TestOrg {

	public static void main(String[] args) {
		Card java = new Card();
		Card angular = new Card();
		
		java.swipe();
		angular.swipe();
		java.swipe();
		angular.swipe();
		
		log.info("Java count is:" + java.count);
		log.info("Angular count is:" + angular.count);
		log.info("Organization count is:" + Card.orgCount);

	}

}
