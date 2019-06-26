package com.covalense.javaapp.collectionsassigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		CompareIdEmp idc = new CompareIdEmp();
		CompareNameEmp namec = new CompareNameEmp();
		CompSalaryEmp salComp = new CompSalaryEmp();

		ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();

		int ch = 1;

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

		al.add(e1);
		al.add(e2);
		al.add(e3);

		switch (ch) {
		case 1:
			Collections.sort(al,new CompareNameEmp());
			break;
		case 2:
			Collections.sort(al,new CompareIdEmp());
			break;
		case 3:
			Collections.sort(al,new CompSalaryEmp());
			break;

		}

		for (EmployeeBean p : al) {
			log.info("details are : " + p);

		}

	}

}
