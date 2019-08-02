package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HibernateUtil {
	@Autowired
   private SessionFactory sessionFactory;

	/*
	 * private static SessionFactory buildSessionFactory() { return new
	 * Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class)
	 * .addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory(); }
	 * 
	 * 
	 * private HibernateUtil() {
	 * 
	 * }
	 * 
	 * public static SessionFactory getSessionFactory() { if (sessionFactory ==
	 * null) { sessionFactory = buildSessionFactory(); } return sessionFactory; }
	 */

	public  Session openSession() {
		return sessionFactory.openSession();
	}
}
