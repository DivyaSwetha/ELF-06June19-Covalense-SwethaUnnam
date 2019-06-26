package com.covalense.javaapp.arraysorting;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class Testemployee {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[5];
		Employee e1 = new Employee();
		e1.setName("Ram");
		e1.setAge(24);
		e1.setSalary(50000);

		Employee e2 = new Employee();
		e2.setName("seetha");
		e2.setAge(22);
		e2.setSalary(40000);

		Employee e3 = new Employee();
		e3.setName("Lakshman");
		e3.setAge(23);
		e3.setSalary(30000);

		Employee e4 = new Employee();
		e4.setName("hanuma");
		e4.setAge(24);
		e4.setSalary(20000);

		Employee e5 = new Employee();
		e5.setName("Bharatha");
		e5.setAge(23);
		e5.setSalary(40000);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		
		Arrays.sort(emp);

		for (Employee e : emp) {
			log.info("Name is: " + e.getName());
			log.info("Age is: " + e.getAge());
			log.info("Salary is: " + e.getSalary());
			log.info("**************************");
		}
	}

}
