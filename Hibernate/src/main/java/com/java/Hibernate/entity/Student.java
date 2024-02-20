package com.java.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ID_Generator")
	@SequenceGenerator(name="ID_Generator",initialValue=10,allocationSize=1)
	@Column(name="Student_id",length=10)
	private int id;
	@Column(name="Student_name",length=10,nullable=false)
	private String name;
	private String course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
