package com.covalense.empnew.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.empnew.beans.EmployeeInfoBean;
import com.covalense.empnew.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		try(SessionFactory factory = HibernateUtil.getSessionFactory();
				Session session = factory.openSession();){
		String hql="from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		List<EmployeeInfoBean> empBeans=query.list();
		return empBeans;
	}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean bean=null;
		try(Session session = HibernateUtil.openSession();){
		 bean = session.get(EmployeeInfoBean.class, id);
		return bean;
	}
	}
    @Override
	public boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(id);
		try (Session session = HibernateUtil.openSession();){
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.deepToString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public List<Integer> getAllEmployeeIds() {
		try(SessionFactory factory = HibernateUtil.getSessionFactory();
				Session session = factory.openSession();){
		String hql="e.id from EmployeeInfoBean e";
		Query query=session.createQuery(hql);
		List<Integer> empIds=query.list();
		return empIds;
	}

}
}
