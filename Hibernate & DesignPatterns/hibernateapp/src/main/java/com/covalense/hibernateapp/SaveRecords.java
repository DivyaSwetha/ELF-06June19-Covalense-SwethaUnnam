package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;;

public class SaveRecords {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse("1997-03-21");
		Date join=format.parse("2019-03-21");

		EmployeeInfoBean employee = new EmployeeInfoBean();
		employee.setId(25);
		employee.setName("usha");
		employee.setAge(22);
		employee.setPhone(9988006655l);
		employee.setSalary(19500);
		employee.setEmail("usha@gmail.com");
		employee.setAccountNumber(123454589087l);
		employee.setDeptId(11);
		//employee.setMngrId(111);
		employee.setGender("female");
		employee.setJoiningDate(join);
		employee.setDesignation("Software Engineer");
		employee.setDob(dob);

		Transaction transaction = session.beginTransaction();
		//session.save(employee);
		session.saveOrUpdate(employee);
		transaction.commit();
		session.close();

	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

}
