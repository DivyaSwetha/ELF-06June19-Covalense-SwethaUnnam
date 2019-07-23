package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeAddressInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class SaveEmployeeAddressInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		EmployeeAddressInfoBean empAddress=new EmployeeAddressInfoBean();
		empAddress.setId(1);
		empAddress.setAddress1("#1,ram nagar, Raja Palace");
		empAddress.setAddress2("near sivaDhanush Arrow bhavan");
		empAddress.setAddress_type("Permanent");
		empAddress.setCity("Ayodhya");
		empAddress.setLandmark("Raja Palace");
		empAddress.setCountry("India");
		empAddress.setState("Ayodhya");
		empAddress.setPincode(100000);
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(empAddress);
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
