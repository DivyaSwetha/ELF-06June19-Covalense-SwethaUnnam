package com.covalense.javaapp.collectionsassigns;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		
		CompareIdEmp idc = new CompareIdEmp();
		CompareNameEmp namec = new CompareNameEmp();
		CompSalaryEmp salComp = new CompSalaryEmp();

		TreeSet<EmployeeBean> t = null;
		int ch = 1;
		
		switch (ch) {
		case 1:
			t = new TreeSet<EmployeeBean>(idc);
			break;
		case 2:
			t = new TreeSet<EmployeeBean>(namec);
			break;
		case 3:
			t = new TreeSet<EmployeeBean>(salComp);
			break;

		}

		EmployeeBean e1 = new EmployeeBean();
		e1.setId(1);
		e1.setName("Srav");
		e1.setSalary(25000);

		EmployeeBean e2 = new EmployeeBean();
		e2.setId(2);
		e2.setName("Sri");
		e2.setSalary(20000);

		EmployeeBean e3 = new EmployeeBean();
		e3.setId(3);
		e3.setName("Sai");
		e3.setSalary(22000);

		t.add(e1);
		t.add(e2);
		t.add(e3);

		for (EmployeeBean p : t) {
			log.info("details are : " + p);

		}

	}

}
