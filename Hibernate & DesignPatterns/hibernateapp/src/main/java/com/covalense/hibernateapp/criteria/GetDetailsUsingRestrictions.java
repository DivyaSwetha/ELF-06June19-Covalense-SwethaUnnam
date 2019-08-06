package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetDetailsUsingRestrictions {

	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary", 20000));
		//Criterion cr = Restrictions.eq("id", 1);
		//criteria.add(cr);
		//EmployeeInfoBean emp=(EmployeeInfoBean) criteria.uniqueResult();
		List<EmployeeInfoBean> beans=criteria.list();
		
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
