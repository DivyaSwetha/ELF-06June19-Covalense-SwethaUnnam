package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {

	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
		//Session session = factory.openSession();
		Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			String hql = "delete from EmployeeInfoBean where id=:eid";
			Query query = session.createQuery(hql);
			query.setParameter("eid", 15);
			int rowsAffected = query.executeUpdate();
			log.info("Deleted---" + rowsAffected);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
