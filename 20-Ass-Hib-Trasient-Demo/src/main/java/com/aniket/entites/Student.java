package com.aniket.entites;

import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	private Integer rno;
	@Column(length=10,nullable=false,unique=true)
	private String name;
	@Column(nullable=false)
	private Double per;
	@Column(nullable=false,length=4)
	private Integer brithYear;
	@Transient
	private Integer age;
	
	
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}
	public Integer getBrithYear() {
		return brithYear;
	}
	public void setBrithYear(Integer brithYear) {
		this.brithYear = brithYear;
		Integer currentYear =  Year.now().getValue();
		setAge(currentYear-brithYear);		
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
