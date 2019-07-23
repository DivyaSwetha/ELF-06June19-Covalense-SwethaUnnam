package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeOtherInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class UpdateEmployeeOtherInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		EmployeeOtherInfoBean employee = session.get(EmployeeOtherInfoBean.class, 12);
		employee.setEmergency_contact_name("prasad");
		employee.setEmergency_contact_number(9988776655l);
		employee.setNationality("Indian");
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(employee);
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
