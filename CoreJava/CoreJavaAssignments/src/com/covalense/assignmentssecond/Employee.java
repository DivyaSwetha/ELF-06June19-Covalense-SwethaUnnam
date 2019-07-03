package com.covalense.assignmentssecond;

import lombok.extern.java.Log;

@Log
public class Employee {

	String name = "swetha";
	int id = 1006;
	double salary = 25000;

	void employee(String s) {
		if (s == name) {
			log.info("name is: " + name);
			log.info("id is: " + id);
			log.info("Salary is: " + salary);
		} else {
			log.info("details not found");
		}
	}

	void employee(int i) {
		if (i == id) {
			log.info("name is: " + name);
			log.info("id is: " + id);
			log.info("Salary is: " + salary);
		} else {
			log.info("details not found");
		}
	}
}
