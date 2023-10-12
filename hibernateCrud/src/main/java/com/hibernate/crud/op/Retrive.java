package com.hibernate.crud.op;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class Retrive {

	public static void main(String[] args) {
		
		SessionFactory factory =HibernateUtil.getSessionFactory();
		
Session session = HibernateUtil.getSession();
		
		try {
			session.beginTransaction();
			Employee emps = session.get(Employee.class, 2);
			
			System.out.println("emp with id 1 info "+ emps);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
