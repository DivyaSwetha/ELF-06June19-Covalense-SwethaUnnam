package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlexample.dto.EmployeeDetailsBean;

public class SaveRecord {

	public static void main(String[] args) {

		EmployeeDetailsBean empBean = new EmployeeDetailsBean();
		empBean.setDeptNo(8);
		empBean.setId(8);
		empBean.setFirstName("vikki");
		empBean.setSecondName("vethal");
		empBean.setEmail("vv@gmail.com");
		empBean.setSalary(21000);
		empBean.setJobType("ASE");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(empBean);
		transaction.commit();
		session.close();
	}

}
