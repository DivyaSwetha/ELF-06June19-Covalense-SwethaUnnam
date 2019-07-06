package com.covalense.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;
import com.covalense.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) throws ParseException {
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		EmployeeDAO dao =EmployeeDAOFactory.getInstance();

		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));
		/*
		 * ArrayList<EmployeeInfoBean> beans=dao.getAllEmployeeInfo();
		 * for(EmployeeInfoBean bean:beans) { printInfo(bean); }
		 */
		
		/*//(To Insert Record)
		 * //Create an Employee Info
		 * 
		 * EmployeeInfoBean employee = new EmployeeInfoBean(); employee.setId(19);
		 * employee.setName("usha"); employee.setAge(22);
		 * employee.setPhone(9988006655l); employee.setSalary(19500);
		 * employee.setEmail("usha@gmail.com");
		 * employee.setAccountNumber(123454589087l); employee.setDepartmentId(11);
		 * employee.setManagerId(111); employee.setGender("female");
		 * 
		 * SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd"); Date
		 * join=format.parse("2019-03-21");
		 * 
		 * employee.setJoiningDate(join); employee.setDesignation("Software Engineer");
		 * 
		 * Date dob=format.parse("1997-03-21"); employee.setDob(dob);
		 * 
		 * log.info("Inserted the employee Info? "+dao.createEmployeeInfo(employee));
		 */
		
		//(To Delete Record)
		log.info("Deleted the employee Info? "+dao.deleteEmployeeInfo(17));

	}//End of Main

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
	}//End of printInfo
}//End of class
