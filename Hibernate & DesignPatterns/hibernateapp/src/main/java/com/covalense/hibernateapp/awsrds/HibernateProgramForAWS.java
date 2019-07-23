package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAWS {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfo.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeNewInfo bean1 = session.get(EmployeeNewInfo.class, 1);
		log.info("Employee Details: " + bean1.toString());
		session.close();

	}

}
