package com.covalense.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("empconfig.xml");
		EmployeeBean empBean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		Scanner scan = new Scanner(System.in);
		log.info("Enter employee id1: ");
		empBean1.setId(scan.nextInt());
		scan.nextLine();
		log.info("Enter Employee Name1: ");
		empBean1.setName(scan.nextLine());
		
		EmployeeBean empBean2 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		log.info("Enter employee id2: ");
		empBean2.setId(scan.nextInt());
		scan.nextLine();
		log.info("Enter Employee Name2: ");
		empBean2.setName(scan.nextLine());
		
		/*
		 * log.info("Employee id1: "+empBean1.getId());
		 * log.info("Employee name1: "+empBean1.getName());
		 * log.info("Employee id2: "+empBean2.getId());
		 * log.info("Employee name2: "+empBean2.getName());
		 */
		log.info("Employee 1: "+empBean1);
		log.info("Employee 2: "+empBean2);
		
		((AbstractApplicationContext)applicationContext).close();
	}
}
