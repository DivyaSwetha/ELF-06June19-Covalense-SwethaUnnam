package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecordsOtherInfo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean employee = session.get(EmployeeOtherInfoBean.class, 1);
		log.info("Is challenged: "+employee.getBlood_grp());
		
	}

}
