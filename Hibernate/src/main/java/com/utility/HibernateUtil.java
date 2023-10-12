//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping
package com.utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.relationship.model.Course;
import com.relationship.model.Department;
import com.relationship.model.Employee;
import com.relationship.model.Student;

public class HibernateUtil {

static SessionFactory factory = null;
	
	static {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Course.class);
		
		factory= cfg.buildSessionFactory();
			}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}
	
	public static Session getSession() {
		
		return factory.openSession();
	}
}
