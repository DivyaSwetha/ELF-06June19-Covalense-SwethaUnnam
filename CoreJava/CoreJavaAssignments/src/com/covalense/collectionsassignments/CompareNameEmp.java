package com.covalense.collectionsassignments;

import java.util.Comparator;

public class CompareNameEmp implements Comparator<EmployeeBean> {

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
