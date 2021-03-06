package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;

public class HibernateUtil {
	private static SessionFactory sessionFactory ;
	
	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class)
				.buildSessionFactory();
	}
	private HibernateUtil() {
		
	}
	 public static SessionFactory getSessionFactory() {
		 if(sessionFactory==null) {
			 sessionFactory=buildSessionFactory();
		 }
		 return sessionFactory;
	 }
	
	 public static Session openSession() {
		 return getSessionFactory().openSession();
	 }
}
