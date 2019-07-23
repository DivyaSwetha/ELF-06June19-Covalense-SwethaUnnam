package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
				//Session session = factory.openSession();
				Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			//String hql = "update from EmployeeInfoBean set name='tanush' where id=14";
			String hql = "update from EmployeeInfoBean set name=:ename where id=:eid";
			//String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id="+args[1]+"";

			Query query = session.createQuery(hql);
			  query.setParameter("ename","prasanna"); 
			  query.setParameter("eid",14);
			
			/*
			 * query.setParameter("ename", args[0]);
			 * query.setParameter("eid",Integer.parseInt(args[1]));
			 */
			 
			 
			int rowsAffected = query.executeUpdate();
			log.info("Updated---" + rowsAffected);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
