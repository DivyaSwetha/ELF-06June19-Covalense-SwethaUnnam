package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class DeleteEmployeeInfoBean {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();

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
