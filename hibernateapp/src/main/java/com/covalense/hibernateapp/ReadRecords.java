package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecords {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean employee = session.get(EmployeeInfoBean.class, 1);
		log.info("Id of employee is: " + employee.getId());
		log.info("Name of employee is: " + employee.getName());
		log.info("Gender is: " + employee.getGender());
		log.info("Age is: " + employee.getAge());
		log.info("Salary is: " + employee.getSalary());
		log.info("Phone no. is: " + employee.getPhone());
		log.info("Email id is: " + employee.getEmail());
		log.info("joining date is: " + employee.getJoiningDate());
		log.info("accountNumber is: " + employee.getAccountNumber());
		log.info("Designation is: " + employee.getDesignation());
		log.info("DOB is: " + employee.getDob());
		log.info("Department id is: " + employee.getDeptId());
		log.info("Manager id is: " + employee.getMngrId());

		session.close();

	}

}
