package com.covalense.hibernate.hibernateassessment.app;

import com.covalense.hibernate.hibernateassessment.dao.CustomerDAO;
import com.covalense.hibernate.hibernateassessment.dao.CustomerDAOImpl;
import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;

import lombok.extern.java.Log;
@Log
public class CustomerBeanReadOperation {
public static void main(String[] args) {
	CustomerDAO dao=new CustomerDAOImpl();
	CustomerBean customerBean=dao.getCustomerDetails(1);
	
	log.info("FirstName: "+customerBean.getFirstName());
	log.info("LastName: "+customerBean.getLastName());
	log.info("contactNumber: "+customerBean.getContactNumber());
	log.info("address: "+customerBean.getAddress());
	log.info("city: "+customerBean.getCity());
	log.info("state: "+customerBean.getState());
	log.info("country: "+customerBean.getCountry());
}
}
