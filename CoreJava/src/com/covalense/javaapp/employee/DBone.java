package com.covalense.javaapp.employee;

public class DBone {
	void recieve(Employee e) {
		System.out.println("***I am DB-1***");
		System.out.println("Employee name is: " + e.getName());
		System.out.println("Salary is: " + e.getSalary());
		System.out.println("Gender is: " + e.getGender());
	}
}
