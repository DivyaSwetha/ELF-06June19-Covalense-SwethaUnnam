package com.covalense.collectionsassignments;

import java.util.Comparator;

public class CompSalaryEmp implements Comparator<EmployeeBean> {

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() < o2.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

}
