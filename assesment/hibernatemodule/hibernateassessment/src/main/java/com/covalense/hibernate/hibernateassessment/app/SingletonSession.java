package com.covalense.hibernate.hibernateassessment.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SingletonSession {

	private SingletonSession() {

	}

	private static SessionFactory sessionFactory = null;

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(CustomerBean.class).buildSessionFactory();
	}

	private static SessionFactory getsessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return getsessionFactory().openSession();
	}

}
