package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.springhibernate.beans.EmployeeInfoBean;

public class DeleteEmployeeInfoBean {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean employee = session.get(EmployeeInfoBean.class, 21);
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(employee);
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
