package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class DeleteRecords {
	
	public static void main(String[] args) {

		//Configuration cfg = new Configuration();
		//cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean employee = session.get(EmployeeInfoBean.class, 17);
		Transaction transaction = session.beginTransaction();
		session.delete(employee);
		transaction.commit();
		session.close();
	}
}
