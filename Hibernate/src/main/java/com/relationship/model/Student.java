//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping
package com.relationship.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int id;		 // Unique identifier for the student.
	
	@Column(name="stud_name")
	private String name;
	
	@Column(name="stud_age")
	private int age;

	//establishing onetomany relationship with course entity
	//mappedBy indicates that relationship is managed by student
	@OneToMany(mappedBy="student", cascade=CascadeType.ALL)
	private List<Course> course = new ArrayList<Course>();
	
	// Getter and setter methods 
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
