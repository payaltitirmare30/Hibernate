//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Utility.HibernateUtility;
import com.model.Students;

public class Delete {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = HibernateUtility.getSession();
		try {
			session.beginTransaction();
		
		Students st = session.get(Students.class, 1);		
		//delete student data 
		session.delete(st);
		
		System.out.println("student data deleted succefully..");
		 session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

}
