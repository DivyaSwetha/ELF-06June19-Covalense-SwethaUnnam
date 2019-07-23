package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {

	public static void main(String[] args) {
		Transaction transaction = null;
		//SessionFactory factory = HibernateUtil.getSessionFactory();
				//Session session = factory.openSession();
				Session session = HibernateUtil.getSession();
		String hql = "insert into EmployeeNewInfo (eid,name,email) select id,name,email from EmployeeInfoBean where id=3";
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			log.info("inserted rows: " + result);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
