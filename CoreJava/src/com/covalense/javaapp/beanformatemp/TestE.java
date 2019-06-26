package com.covalense.javaapp.beanformatemp;

import java.util.logging.Logger;

public class TestE {
	private static final Logger loger = Logger.getLogger("Employee2");

	public static void main(String[] args) {
		EmployeeBean e = new EmployeeBean();
		loger.info("without lombok--->" + e.toString());

		EmployeeBeanTwo e2 = new EmployeeBeanTwo();
		e2.setAge(20);
		loger.info("without lombok--->" + e2.toString());

	}

}
