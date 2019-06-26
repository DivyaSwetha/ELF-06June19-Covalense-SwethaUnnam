package com.covalense.javaapp.immuteclasstwo;

import lombok.extern.java.Log;

@Log
public class TestEmp {

	public static void main(String[] args) {

		Employee e = new Employee("Ram", 23, 5.5, 'M', true);
		log.info("name: " + e.getName());
		log.info("age: " + e.getAge());
		log.info("height: " + e.getHeight());
		log.info("gender: " + e.getGender());
		log.info("status: " + e.isStatus());

	}

}
