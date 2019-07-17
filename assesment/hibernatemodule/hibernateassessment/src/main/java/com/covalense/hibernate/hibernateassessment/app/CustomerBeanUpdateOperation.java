package com.covalense.hibernate.hibernateassessment.app;

import com.covalense.hibernate.hibernateassessment.dao.CustomerDAO;
import com.covalense.hibernate.hibernateassessment.dao.CustomerDAOImpl;
import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;

public class CustomerBeanUpdateOperation {

	public static void main(String[] args) {
		CustomerDAO dao=new CustomerDAOImpl();
		CustomerBean customerBean=dao.getCustomerDetails(1);
		customerBean.setFirstName("Manchala");
		dao.updateCustomerDetails(customerBean);
		
	}

}
