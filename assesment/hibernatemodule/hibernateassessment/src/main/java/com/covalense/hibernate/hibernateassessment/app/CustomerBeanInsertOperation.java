package com.covalense.hibernate.hibernateassessment.app;

import com.covalense.hibernate.hibernateassessment.dao.CustomerDAO;
import com.covalense.hibernate.hibernateassessment.dao.CustomerDAOImpl;
import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;

public class CustomerBeanInsertOperation {

	public static void main(String[] args) {

		//Inserting data
		CustomerDAO dao=new CustomerDAOImpl();
		CustomerBean bean=new CustomerBean();
		bean.setId(1);
		bean.setFirstName("Ram");
		bean.setLastName("Unnam");
		bean.setContactNumber(9988776655l);
		bean.setAddress("Sri ramnagar, kadapa, A.P");
		bean.setCity("Kadapa");
		bean.setCountry("India");
		bean.setState("Andhra Pradesh");
		dao.saveCustomerDetails(bean);
}
}
