package com.covalense.designpatterns.dao;

public class EmployeeDAOFactory {
	
	private EmployeeDAOFactory() {

	}

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equalsIgnoreCase("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equalsIgnoreCase("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
	}// End of getInstance()
}// End of Class