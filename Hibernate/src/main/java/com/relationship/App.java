package com.relationship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.relationship.model.Department;
import com.relationship.model.Employee;
import com.utility.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = HibernateUtil.getSession();
        
      /*  try {
        	Department department = new Department();
        	department.setName("IT");
        	
        	Employee emp1 = new Employee();
        	emp1.setName("payal");
        	emp1.setDepartment(department);
        	
        	Employee emp2 = new Employee();
        	emp2.setName("saurabh");
        	emp2.setDepartment(department);
        	
        	department.getEmployee().add(emp1);
        	department.getEmployee().add(emp2); */
        
       
        Department dept1 = new Department();
        Department dept2 = new Department();
        
        dept1.setName("IT");
        dept2.setName("Finance");
        	
        Employee emp1 = new Employee();
    	emp1.setName("payal");
    	
    	Employee emp2 = new Employee();
    	emp2.setName("saurabh");
        
    	List<Department> deptlist=new ArrayList<Department>();
    	
    	List<Employee> emplist = new ArrayList<Employee>();
    	
    	deptlist.add(dept1);
    	deptlist.add(dept2);
    	
    	emplist.add(emp1);
    	emplist.add(emp2);
    	
    	
    	emp1.setDepartment(deptlist);
    	
    	dept1.setEmployee(emplist);
    	
        	session.beginTransaction();
        	
        	session.save(emp1);
        	session.save(emp2);
        	session.save(dept1);
        	session.save(dept2);
        	
        	session.getTransaction().commit();
        
        	session.close();
        	factory.close();
        	
       
    }
}
