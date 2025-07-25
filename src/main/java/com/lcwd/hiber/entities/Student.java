package com.lcwd.hiber.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	//field
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentId;
	
	@Column(name = "student_name",length = 100,unique=true)
	private String name;
	
	@Column(name="student_college", length = 200, nullable = true)
	private String college;
	
	private String fatherName;
	
	private boolean active = true;
	
	@Lob
	private String about;

}
