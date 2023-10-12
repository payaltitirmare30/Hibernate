package com.hibernate.crud.op;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class Delete {

	public static void main(String[] args) {
		
        SessionFactory factory =HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession();
		
		try {
			session.beginTransaction();
			Employee empss = session.get(Employee.class, 1);
			
			session.delete(empss);
		
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
