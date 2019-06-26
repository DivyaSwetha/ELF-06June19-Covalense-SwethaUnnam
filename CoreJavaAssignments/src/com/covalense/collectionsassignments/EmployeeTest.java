package com.covalense.collectionsassignments;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {

		ArrayList<Employee> a = new ArrayList<Employee>();

		Employee e1 = new Employee();
		e1.setName("Ram");
		e1.setGender('m');
		e1.setSalary(25000);

		Employee e2 = new Employee();
		e2.setName("Seetha");
		e2.setGender('f');
		e2.setSalary(15000);

		a.add(e1);
		a.add(e2);

		for (Employee emp : a) {
			log.info("Name is: " + emp.getName());
			log.info("Gender is: " + emp.getGender());
			log.info("salary is: " + emp.getSalary());
		}
	}

}
