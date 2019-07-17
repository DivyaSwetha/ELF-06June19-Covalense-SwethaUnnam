package com.covalense.hibernate.hibernateassessment.dao;

import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;

public interface CustomerDAO {

	public CustomerBean getCustomerDetails(int id);
	public CustomerBean getCustomerDetails(String id);
	public boolean saveCustomerDetails(CustomerBean bean);
	public boolean deleteCustomerDetails(int id);
	public boolean updateCustomerDetails(CustomerBean bean);
	public boolean saveOrUpdate(CustomerBean bean);
	
}
