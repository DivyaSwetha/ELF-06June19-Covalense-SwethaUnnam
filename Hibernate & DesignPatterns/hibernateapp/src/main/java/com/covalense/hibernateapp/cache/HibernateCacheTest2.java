package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
		log.info("1st Time" + getEmployeeData(1).toString());
		log.info("2nd Time" + getEmployeeData(1).toString());
		log.info("3rd Time" + getEmployeeData(1).toString());


	}// End of Main

	private static NewEmployeeInfoBean getEmployeeData(int id) {
		NewEmployeeInfoBean bean;
		try(Session session = HibernateCacheUtil.openSession();){
				bean = session.get(NewEmployeeInfoBean.class, id);
		}
		return bean;
	}// End of getEmployeeData
}// End of Class
