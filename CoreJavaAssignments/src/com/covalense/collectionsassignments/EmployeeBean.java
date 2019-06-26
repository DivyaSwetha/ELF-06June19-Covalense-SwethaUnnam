package com.covalense.collectionsassignments;

import lombok.Data;

@Data
public class EmployeeBean implements Comparable<EmployeeBean> {
	private int id;
	private String name;
	private double salary;


	@Override
	public int compareTo(EmployeeBean o) {
		String a = this.name;
		String b = o.getName();
		int k = a.compareTo(b);
		return k;
	}

}
