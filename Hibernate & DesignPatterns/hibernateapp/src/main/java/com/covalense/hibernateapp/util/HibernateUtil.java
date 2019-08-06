package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HibernateUtil {
	private static SessionFactory sessionFactory=null ;
	
	private static SessionFactory buildSessionFactory() {
		/*` new Configuration();
		 * //cfg.configure("hibernate.cfg.xml");
		 * cfg.addAnnotatedClass(EmployeeInfoBean.class); SessionFactory sessionFactory
		 * = cfg.buildSessionFactory(); return sessionFactory;
		 */
		return new Configuration()
					.configure()
					.buildSessionFactory();
	}
	
	
	
	 private static SessionFactory getSessionFactory() {
		 if(sessionFactory==null) {
			 sessionFactory=buildSessionFactory();
		 }
		 return sessionFactory;
	 }
	 public static Session getSession() {
		 return getSessionFactory().openSession();
	 }
	
}
