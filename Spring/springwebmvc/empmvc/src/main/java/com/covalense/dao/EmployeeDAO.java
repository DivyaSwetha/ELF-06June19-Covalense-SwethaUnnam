package com.covalense.dao;

import java.util.List;

import com.covalense.dto.EmployeeInfoBean;



public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();
	boolean saveOrUpdate(EmployeeInfoBean bean);
	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);

}
