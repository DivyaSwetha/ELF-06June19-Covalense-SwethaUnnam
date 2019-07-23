package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallingStoredProcedure {

	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("getrecords",EmployeeInfoBean.class);
		List<EmployeeInfoBean> beans = query.getResultList();
		
		for (EmployeeInfoBean employeeInfoBean : beans) {
			log.info("Id of employee is: " + employeeInfoBean.getId());
			log.info("Name of employee is: " + employeeInfoBean.getName());
			log.info("Gender is: " + employeeInfoBean.getGender());
			log.info("Age is: " + employeeInfoBean.getAge());
			log.info("Salary is: " + employeeInfoBean.getSalary());
			log.info("Phone no. is: " + employeeInfoBean.getPhone());
			log.info("Email id is: " + employeeInfoBean.getEmail());
			log.info("joining date is: " + employeeInfoBean.getJoiningDate());
			log.info("accountNumber is: " + employeeInfoBean.getAccountNumber());
			log.info("Designation is: " + employeeInfoBean.getDesignation());
			log.info("DOB is: " + employeeInfoBean.getDob());
			log.info("Department id is: " + employeeInfoBean.getDeptId());
			log.info("Manager id is: " + employeeInfoBean.getMngrId());
		}
	}

}
