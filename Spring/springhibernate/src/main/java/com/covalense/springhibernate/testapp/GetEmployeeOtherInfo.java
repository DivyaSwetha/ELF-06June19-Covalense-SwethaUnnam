package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.springhibernate.beans.EmployeeInfoBean;
import com.covalense.springhibernate.beans.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class GetEmployeeOtherInfo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeOtherInfoBean employee = session.get(EmployeeOtherInfoBean.class, 1);
		log.info("Is challenged: "+employee.getBlood_grp());
		log.info("ID : "+employee.getId());
		log.info("PAN: "+employee.getPan());
		log.info("Adhar: "+employee.getAdhar());
		log.info("Emergency Contact Name : "+employee.getEmergency_contact_name());
		log.info("Emergency contact number : "+employee.getEmergency_contact_number());
		log.info("Father Name : "+employee.getFather_nm());
		log.info("Mother Name : "+employee.getMother_nm());
		log.info("Nationality : "+employee.getNationality());
		log.info("Passport : "+employee.getPassport());
		
			session.close();
		
		
	}

}
