//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Utility.HibernateUtility;
import com.model.Students;

public class Create {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = HibernateUtility.getSession();
		try {
		Transaction tx =session.beginTransaction();
		
		Students stud1 = new Students("Paki","Sharma",22);
		
		Students stud2 = new Students("Ram","Charan",35);
		//save student data 
		session.save(stud1);
		session.save(stud2);
		
		tx.commit();
		}
		finally {
		session.close();
		factory.close();
		}
		
	}

}
