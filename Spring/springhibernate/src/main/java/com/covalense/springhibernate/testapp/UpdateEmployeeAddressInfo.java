package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeAddressInfoBean;
import com.covalense.springhibernate.beans.EmployeeInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class UpdateEmployeeAddressInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		EmployeeAddressInfoBean employee = session.get(EmployeeAddressInfoBean.class, 2);
		employee.setAddress2("29th mainroad, near kunti");
		employee.setPincode(110000);
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
