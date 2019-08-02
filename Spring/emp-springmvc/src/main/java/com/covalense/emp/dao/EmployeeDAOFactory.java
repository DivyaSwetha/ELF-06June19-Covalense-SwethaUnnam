package com.covalense.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
    @Bean("jdbc")
	public EmployeeDAO getJdbcInstance(){	
		return new EmployeeDAOJDBCImpl();
	}// End of getInstance()
    @Bean("hibernate")
	public EmployeeDAO getHibernateInstance(){	
		return new EmployeeDAOHibernateImpl();
	}// End of getInstance()
}// End of Class
