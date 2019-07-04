package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory ;
	
	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg2.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		return sessionFactory;
	}
	
	
	
	 public static SessionFactory getSessionFactory() {
		 if(sessionFactory==null) {
			 sessionFactory=buildSessionFactory();
		 }
		 return sessionFactory;
	 }
	
}
