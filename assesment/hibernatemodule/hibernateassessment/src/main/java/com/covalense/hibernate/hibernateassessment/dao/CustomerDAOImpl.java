package com.covalense.hibernate.hibernateassessment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernate.hibernateassessment.dto.CustomerBean;
import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {
	Transaction transaction = null;

	public CustomerBean getCustomerDetails(int id) {

		CustomerBean customerBean = null;
		try (Session session = HibernateUtil.openSession();) {
			transaction = session.beginTransaction();
			customerBean = session.get(CustomerBean.class, id);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return customerBean;

	}

	public CustomerBean getCustomerDetails(String id) {
		return getCustomerDetails(Integer.parseInt(id));
	}

	public boolean saveCustomerDetails(CustomerBean bean) {

		return saveOrUpdate(bean);

	}

	public boolean deleteCustomerDetails(int id) {
		CustomerBean customerBean=getCustomerDetails(id);
		Session session=HibernateUtil.openSession();
		transaction=session.beginTransaction();
		session.delete(customerBean);
		transaction.commit();
		return true;
	}

	public boolean updateCustomerDetails(CustomerBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean saveOrUpdate(CustomerBean bean) {
		CustomerBean customerBean = null;
		try (Session session = HibernateUtil.openSession();) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return true;
	}


}
