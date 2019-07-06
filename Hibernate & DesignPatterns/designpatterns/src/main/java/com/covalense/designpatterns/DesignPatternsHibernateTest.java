package com.covalense.designpatterns;


import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOHibernateImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsHibernateTest {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));

	}// End of Main

	private static void printInfo(EmployeeInfoBean bean) {
		log.info("Id of employee is: " + bean.getId());
		log.info("Name of employee is: " + bean.getName());
		log.info("Gender is: " + bean.getGender());
		log.info("Age is: " + bean.getAge());
		log.info("Salary is: " + bean.getSalary());
		log.info("Phone no. is: " + bean.getPhone());
		log.info("Email id is: " + bean.getEmail());
		log.info("joining date is: " + bean.getJoiningDate());
		log.info("accountNumber is: " + bean.getAccountNumber());
		log.info("Designation is: " + bean.getDesignation());
		log.info("DOB is: " + bean.getDob());
		log.info("Department id is: " + bean.getDepartmentId());
		log.info("Manager id is: " + bean.getManagerId());
	}// End of printInfo
}// End of class
