package com.covalense.javaapp.lambda;

import lombok.Data;

@Data
public class EmployeeBean {
	private int id;
	private String name;
	private double salary;

	public EmployeeBean(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
