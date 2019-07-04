package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public interface HibUtils {
	Configuration CFG = new Configuration();
	SessionFactory FACTORY = CFG.buildSessionFactory();
	Session SESSION = FACTORY.openSession();
	Transaction TRANSACTION = SESSION.beginTransaction();
	String COMMIT="TRANSACTION.commit()";
	String CLOSE="session.close()";




}
