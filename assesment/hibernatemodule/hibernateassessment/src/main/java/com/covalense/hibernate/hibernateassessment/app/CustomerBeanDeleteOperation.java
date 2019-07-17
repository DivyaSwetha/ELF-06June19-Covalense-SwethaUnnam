package com.covalense.hibernate.hibernateassessment.app;

import com.covalense.hibernate.hibernateassessment.dao.CustomerDAO;
import com.covalense.hibernate.hibernateassessment.dao.CustomerDAOImpl;

public class CustomerBeanDeleteOperation {
public static void main(String[] args) {
	CustomerDAO dao=new CustomerDAOImpl();	
	dao.deleteCustomerDetails(1);
}
}
