package com.covalense.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTestManualWiring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("empconfig.xml");
		EmployeeBean empBean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		log.info("Employee id: " + empBean1.getId());
		log.info("Employee Name: " + empBean1.getName());
		log.info("Employee DepartmentId: " + empBean1.getDepartmentBean().getDeptId());
		log.info("Employee DepartmentName: " + empBean1.getDepartmentBean().getDeptName());
	}
}
