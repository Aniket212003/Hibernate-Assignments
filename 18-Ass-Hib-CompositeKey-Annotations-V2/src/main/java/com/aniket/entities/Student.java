package com.aniket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@IdClass(StudentCompositeKey.class)
public class Student 
{
	@Id
	@Column(name="fname")
	private String fname;
	@Id
	@Column(name="lname")
	private String lname;
	@Column(name="city")
	private String city;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
