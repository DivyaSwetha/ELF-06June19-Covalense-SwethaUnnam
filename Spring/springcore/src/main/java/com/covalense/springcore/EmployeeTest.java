package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean empBean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		log.info("Employee details are: "+empBean1); 
		EmployeeBean empBean2 = (EmployeeBean) applicationContext.getBean("employeeBean2");
		log.info("Employee details are: "+empBean2); 
	}

}
