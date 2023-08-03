package com.springjpaexample.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames="name")})
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	private String name;
	
	private String fatherName;
	private int age;
	private BigDecimal marks;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	
	private String description;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getMarks() {
		return marks;
	}
	public void setMarks(BigDecimal marks) {
		this.marks = marks;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Student(Long id, String name, String fatherName, int age, BigDecimal marks, LocalDateTime dateCreated,
			LocalDateTime lastUpdated, String description) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.age = age;
		this.marks = marks;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.description = description;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", age=" + age + ", marks="
				+ marks + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", description="
				+ description + "]";
	}
	
	
	
	
	
	
	
	
	

}
