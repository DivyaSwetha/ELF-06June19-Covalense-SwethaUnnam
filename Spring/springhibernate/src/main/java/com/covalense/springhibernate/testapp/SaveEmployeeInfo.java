package com.covalense.springhibernate.testapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;


public class SaveEmployeeInfo {

	public static void main(String[] args) throws ParseException {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		
		EmployeeInfoBean employee = new EmployeeInfoBean();
		employee.setId(21);
		employee.setName("pratyusha");
		employee.setAge(22);
		employee.setPhone(9988006655l);
		employee.setSalary(19500);
		employee.setEmail("pratyusha@gmail.com");
		employee.setAccountNumber(123454589087l);
		employee.setDeptId(11);
		employee.setMngrId(111);
		employee.setGender("female");
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse("1997-03-21");
		Date join=format.parse("2019-03-21");

		employee.setJoiningDate(join);
		employee.setDesignation("Software Engineer");
		employee.setDob(dob);

		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(employee);
			tx.commit();
			
		}catch(Exception e) {
			if(tx==null) {
				tx.rollback();
			}
		}finally {
			session.close();
		}
		

	}

}
