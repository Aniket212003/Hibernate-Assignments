package com.aniket.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@EmbeddedId
	private StudentCompositeKey id;
	@Column(name="city")
	private String city;
	public StudentCompositeKey getId() {
		return id;
	}
	public void setId(StudentCompositeKey id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
