package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeAddressInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class DeleteEmployeeAddressInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		EmployeeAddressInfoBean empAddress=session.get(EmployeeAddressInfoBean.class, 2);
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(empAddress);
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
