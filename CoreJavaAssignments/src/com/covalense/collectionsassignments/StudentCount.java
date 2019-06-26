package com.covalense.collectionsassignments;

import lombok.extern.java.Log;

@Log
public class StudentCount {

	static int noOfObjects = 0;

	public StudentCount() {
		noOfObjects++;
	}

	public static void main(String[] args) {

		StudentCount s = new StudentCount();
		StudentCount s1 = new StudentCount();

		log.info("Number of objects created: " + StudentCount.noOfObjects);

	}

}
