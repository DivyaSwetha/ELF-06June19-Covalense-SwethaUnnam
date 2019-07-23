package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.DepartmentInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetDepartmentInfo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		DepartmentInfoBean dept = session.get(DepartmentInfoBean.class, 11);
		log.info("Department Id: " + dept.getDept_id());
		log.info("Department Name: " + dept.getDept_name());
		session.close();

	}

}
