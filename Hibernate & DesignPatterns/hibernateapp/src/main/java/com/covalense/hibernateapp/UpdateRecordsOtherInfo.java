package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecordsOtherInfo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean employee = session.get(EmployeeOtherInfoBean.class, 11);
		employee.setAdhar(3117623278765l);
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
	}

}
