//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Students;

public class HibernateUtility {

	static SessionFactory factory=null;
	
	static {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernates.cfg.xml");
		
		cfg.addAnnotatedClass(Students.class);
		
		factory = cfg.buildSessionFactory();	
	}
	
	public static SessionFactory getSessionFactory() {
		return factory ;
	}
	
	public static Session getSession() {
		return factory.openSession();
	}
}
