//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_management")
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int id;
	
	@Column(length=50)
	private String firstName;
	
	@Column(length=50)
	private String lastName;
	
	@Column(name="stud_age")
	private int age;

	public Students() {
		}

	public Students( String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	
}
