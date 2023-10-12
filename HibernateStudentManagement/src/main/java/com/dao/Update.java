//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Utility.HibernateUtility;
import com.model.Students;

public class Update {

	public static void main(String[] args) {
		
SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = HibernateUtility.getSession();
		try {
			session.beginTransaction();
		
		Students st1 = session.get(Students.class, 2);		
		//setting another value 
		st1.setAge(23);
		
		//update data in database 
		session.update(st1);
		
		System.out.println("student data updated succefully..");
		 session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
