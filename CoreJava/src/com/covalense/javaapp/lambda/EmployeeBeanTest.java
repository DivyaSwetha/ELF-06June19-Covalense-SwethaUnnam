package com.covalense.javaapp.lambda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {

		EmployeeBean e1 = new EmployeeBean(1, "ram", 32000);
		EmployeeBean e2 = new EmployeeBean(2, "see", 30000);
		EmployeeBean e3 = new EmployeeBean(3, "siri", 34000);
		EmployeeBean e4 = new EmployeeBean(4, "hari", 36000);
		EmployeeBean e5 = new EmployeeBean(5, "varu", 30000);
		


		Comparator<EmployeeBean> c1=(e,f)->e.getName().compareTo(f.getName());
		
		Comparator<EmployeeBean> c2=(e,f)->{
			
			if (e.getId() > f.getId()) {
				return 1;
			} else if (e.getId() < f.getId()) {
				return -1;
			} else {
				return 0;
			}
			
		};
		
		TreeSet<EmployeeBean> ts = new TreeSet<EmployeeBean>(c1);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		for (EmployeeBean p : ts) {
			log.info("details are : " + p);

		}

	}

}
