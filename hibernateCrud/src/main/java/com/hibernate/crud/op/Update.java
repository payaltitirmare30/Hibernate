package com.hibernate.crud.op;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		SessionFactory factory =HibernateUtil.getSessionFactory();
		
		Session session = HibernateUtil.getSession();
				
				try {
					session.beginTransaction();
					Employee emps = session.get(Employee.class, 2);
					
					emps.setSalary(30000.00);
			        emps.setEmpDept("Java Developer"); 
				session.update(emps);
				
				session.getTransaction().commit();
				
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}

	}


