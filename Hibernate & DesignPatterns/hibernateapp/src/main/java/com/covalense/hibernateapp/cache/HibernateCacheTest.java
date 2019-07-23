package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		NewEmployeeInfoBean bean1 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("1st Time: "+bean1.toString());
		
		NewEmployeeInfoBean bean2 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("2nd Time: "+bean2.toString());
		
		NewEmployeeInfoBean bean3 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("3rd Time: "+bean3.toString());
		session.close();

	}// End of Main

}// End of Class
