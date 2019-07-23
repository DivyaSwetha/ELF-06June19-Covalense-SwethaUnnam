package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeAddressInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

import lombok.extern.java.Log;
@Log
public class GetEmployeeAddressInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		EmployeeAddressInfoBean empAddress=session.get(EmployeeAddressInfoBean.class, 1);
		log.info("employee id: "+empAddress.getId());
		log.info("Address Type: "+empAddress.getAddress_type());
		log.info("Address1: "+empAddress.getAddress1());
		log.info("Addresss2: "+empAddress.getAddress2());
		log.info("Landmark: "+empAddress.getLandmark());
		log.info("City: "+empAddress.getCity());
		log.info("Pincode: "+empAddress.getPincode());
		log.info("State: "+empAddress.getState());
		log.info("Country: "+empAddress.getCountry());
		
		session.close();

	}

}
