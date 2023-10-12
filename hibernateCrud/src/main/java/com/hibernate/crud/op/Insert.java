package com.hibernate.crud.op;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;


public class Insert {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession();
		
		try {
			session.beginTransaction();
			
			Employee emp1 = new Employee("payal","Developer",50000.00);
			Employee emp2 = new Employee("yehu","RA",10000.00);
			
			Employee emp3 = new Employee("yatin","Management",20000.00);
			
			Employee emp4 = new Employee("Askash","Admin",40000.00);
			
			Employee emp5 = new Employee("swaraj","AWS Trsiner",45000.00);
			
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.save(emp4);
			session.save(emp5);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
