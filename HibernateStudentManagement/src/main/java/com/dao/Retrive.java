//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.Utility.HibernateUtility;
import com.model.Students;

public class Retrive {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = HibernateUtility.getSession();
		//retriving data 
		Students s1 = session.get(Students.class, 1);	
		
		//getting student data		
		System.out.println(s1.getId());
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		System.out.println(s1.getAge());
		
		session.close();
		factory.close();
	}

}
