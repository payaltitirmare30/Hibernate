//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping
package com.relationship;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.relationship.model.Course;
import com.relationship.model.Student;
import com.utility.HibernateUtil;

public class StudentApp {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = HibernateUtil.getSession();
       
        try {
        	
        	Student stud = new Student();
        	stud.setName("payal");
        	stud.setAge(22);
        	
        	Course course1 = new Course();
        	course1.setName("java full stack");
        	
        	Course course2 = new Course();
        	course2.setName("salesforce");
        	
        	stud.getCourse().add(course1);
        	stud.getCourse().add(course2);
        	
        	course1.setStudent(stud);
        	course2.setStudent(stud);
        	
        	session.beginTransaction();
    	
        	session.save(stud);
    	
        	session.getTransaction().commit();
        	}
        
        	finally {
        		session.close();
        		factory.close();   	
        	}
	}

}
