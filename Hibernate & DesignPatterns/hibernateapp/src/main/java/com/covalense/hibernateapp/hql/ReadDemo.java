package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
				//Session session = factory.openSession();
				Session session = HibernateUtil.getSession();
		/*
		 * String hql = " from EmployeeInfoBean"; Query query =
		 * session.createQuery(hql); List<EmployeeInfoBean> employeeInfoBeans =
		 * query.list();
		 * 
		 * for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
		 * 
		 * log.info("Id of employee is: " + employeeInfoBean.getId());
		 * log.info("Name of employee is: " + employeeInfoBean.getName());
		 * log.info("Gender is: " + employeeInfoBean.getGender()); log.info("Age is: " +
		 * employeeInfoBean.getAge()); log.info("Salary is: " +
		 * employeeInfoBean.getSalary()); log.info("Phone no. is: " +
		 * employeeInfoBean.getPhone()); log.info("Email id is: " +
		 * employeeInfoBean.getEmail()); log.info("joining date is: " +
		 * employeeInfoBean.getJoiningDate()); log.info("accountNumber is: " +
		 * employeeInfoBean.getAccountNumber()); log.info("Designation is: " +
		 * employeeInfoBean.getDesignation()); log.info("DOB is: " +
		 * employeeInfoBean.getDob()); log.info("Department id is: " +
		 * employeeInfoBean.getDeptId()); log.info("Manager id is: " +
		 * employeeInfoBean.getMngrId());
		 * 
		 * }
		 */
		String hql="select name from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		List<String> ename=query.list();
		for (String empName : ename) {
			
			log.info("Name is: "+empName);
			
		}
		
		session.close();
	}
}
